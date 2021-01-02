import  java.util.*;
public class LC249GroupShiftedStrings {
    /*public static List<List<String>> groupStrings(String[] strings) {
        List<List<String>> ans = new ArrayList<>();

        //corner cases
        if (strings.length == 0) {
            return ans;
        }

        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strings) {
            String key = getKey(str);
            if (map.containsKey(key)) {
                map.get(key).add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(key, list);
            }
        }
        for (List<String> list : map.values()) {
            Collections.sort(list);
            ans.add(list);
        }
        return ans;
    }*/

    public static boolean translate(String s, String t) {
        if(s.length() != t.length())
            return false;
        return s.equals(getKey(t));
    }
    private static String getKey(String str) {
        if (str.length() == 0) {
            return "";
        }
        if (str.length() == 1) {
            return "z";
        }
        char[] chars = str.toCharArray();
        int offset = 'z' - chars[0];
        for(int i = 0; i < chars.length; i++) {
            chars[i] += offset;
            if (chars[i] > 'z') {
                chars[i] -= 26;
            }
        }
        return new String(chars);
    }

    public static void main(String args[]) {
        /*String[] strings = {"abc", "bcd", "acef", "xyz", "az", "ba", "a", "z"};
        List<List<String>> res = groupStrings(strings);
        res.stream().forEach(System.out::println);*/
        String s = "abc";
        String t = "xyz";
        boolean res =translate(s,t);
        System.out.print(res);

    }
}
