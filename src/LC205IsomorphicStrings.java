import  java.util.*;
public class LC205IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        int[] ms = new int[128];
        int[] mt = new int[128];
        for(int i = 0; i< s.length();i++) {
            if(ms[s.charAt(i)] != mt[t.charAt(i)])
                return false;
            ms[s.charAt(i)] = i+1;
            mt[t.charAt(i)] = i+1;
        }
        return true;
    }

    public static void main(String args[]) {
        String s= "ebb";
        String t= "add";
        boolean res = isIsomorphic(s,t);
        System.out.println(res);
    }

}
