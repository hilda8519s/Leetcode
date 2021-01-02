import java.util.*;
public class LC616AddBoldTaginString {
    public static String addBoldTag(String s, String[] dict) {
        int n = s.length();
        int[] mark = new int[n+1];
        for(String d : dict) {
            int i = -1;
            while((i = s.indexOf(d, i+1)) >= 0) {
                mark[i]++;
                mark[i + d.length()]--;
            }
        }
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for(int i = 0; i <= n; i++) {
            int cur = sum + mark[i];
            if (cur > 0 && sum == 0)
                sb.append("<b>");
            if (cur == 0 && sum > 0)
                sb.append("</b>");
            if (i == n)
                break;
            sb.append(s.charAt(i));
            sum = cur;
        }
        return sb.toString();
    }

    public static void main(String args[]) {
        String s = "abcxyz123";
        String[] dict = {"abc","123"};
        String res = addBoldTag(s,dict);
        System.out.print(res);
    }
}
