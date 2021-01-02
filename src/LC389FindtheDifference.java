import  java.util.*;

public class LC389FindtheDifference {
    public static char findTheDifference(String s, String t) {
        char c = 0;
        for (int i = 0; i < s.length(); ++i) {
            c ^= s.charAt(i);
        }
        for (int i = 0; i < t.length(); ++i) {
            c ^= t.charAt(i);
        }
        return c;
    }

    public static void main(String args[]) {
        String s = "ab";
        String t = "abc";
        char c = findTheDifference(s,t);
        System.out.println(c);
    }
}
