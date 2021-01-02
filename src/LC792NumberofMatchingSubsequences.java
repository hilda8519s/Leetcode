import java.util.*;

public class LC792NumberofMatchingSubsequences {
    public static int numMatchingSubseq(String S, String[] words) {

        Map<Character, Queue<String>> map = new HashMap<>();
        int count = 0;
        for(int i = 0; i < S.length(); i++) {
            map.putIfAbsent(S.charAt(i), new LinkedList<>());
        }
        for(String word : words) {
            char c = word.charAt(0);
            if(map.containsKey(c)) {
                map.get(c).offer(word);
            }
        }
        for(int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            Queue<String> q = map.get(c);
            int size = q.size();
            for(int k = 0; k < size; k++) {
                String str = q.poll();
                if(str.length() == 1) {
                    count++;
                } else {
                    if(map.containsKey(str.charAt(1))) {
                        map.get(str.charAt(1)).add(str.substring(1));
                    }
                }
            }
        }
        return count;
    }

    public static void main(String args[]) {
        String s = "abcde";
        String[] words = {"a","bb","acd","ace"};
        int res = numMatchingSubseq(s,words);
        System.out.println(res);
    }
}
