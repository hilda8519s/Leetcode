import java.util.*;

public class LC524LongestWordinDictionarythroughDeleting {
    public static  String findLongestWord(String s, List<String> d) {
        Collections.sort(d, (a,b) -> a.length() != b.length() ? -Integer.compare(a.length(), b.length()) :  a.compareTo(b));
        for (String dictWord : d) {
            int i = 0;
            for (char c : s.toCharArray())
                if (i < dictWord.length() && c == dictWord.charAt(i))
                    i++;
            if (i == dictWord.length())
                return dictWord;
        }
        return "";
    }
    public static void main(String args[]){
        String s = "abpcplea";
        List<String> d= new java.util.ArrayList<>();
        d.add("ale");
        d.add("apple");
        d.add("monkey");
        d.add("plea");
        String res = findLongestWord(s,d);
        System.out.println(res);


    }
}
