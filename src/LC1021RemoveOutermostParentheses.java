import java.util.*;
public class LC1021RemoveOutermostParentheses {
    public static String removeOuterParentheses(String S) {
        StringBuilder sb = new StringBuilder();
        int n = S.length();
        System.out.println(n);
        int index = 0, open = 0, close = 0;
        for(int i=0; i<S.length(); i++) {
            if(S.charAt(i) == '(') {
                open++;
            } else if(S.charAt(i) == ')') {
                close++;
            }
            if(open==close) {
                sb.append(S.substring(index + 1, i));
                index = i + 1;
            }
        }

        return sb.toString();
    }
    public static void main(String args[]) {
        String s = "(()())";
        String res = removeOuterParentheses(s);
        System.out.println(res);
    }

}
