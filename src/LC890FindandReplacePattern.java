import java.util.*;

public class LC890FindandReplacePattern {
    public static List<String> findAndReplacePattern(String[] words, String pattern) {
        int[] p = F(pattern);
        List<String> res = new ArrayList<String>();
        for (String w : words)
            if (Arrays.equals(F(w), p))
                res.add(w);
        return res;
    }

    public static int[] F(String w) {
        HashMap<Character, Integer> m = new HashMap<>();
        int n = w.length();
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            m.putIfAbsent(w.charAt(i), m.size());
            temp[i] = m.get(w.charAt(i));
        }
        return temp;
    }

    public static void main(String args[]) {
        String[] words = {"abc","deq","mee","aqq","dkd","ccc"};
        String pattern = "abb";
        List<String> res =findAndReplacePattern(words,pattern);
        res.forEach(System.out::println);

    }


}
