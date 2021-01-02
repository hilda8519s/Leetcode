public class LC214ShortestPalindrome {
    public static String shortestPalindrome(String s) {// time o(n^2)
        int i = 0, j = s.length() - 1;
        int end = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                i = 0;
                end--;
                j = end;
            }
        }
        return new StringBuilder(s.substring(end + 1)).reverse().toString() + s;
    }
    public static void main(String args[]) {
        String s = "abcd";
        String res = shortestPalindrome(s);
        System.out.println(res);
    }
}
