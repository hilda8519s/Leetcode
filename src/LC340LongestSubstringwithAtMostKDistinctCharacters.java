public class LC340LongestSubstringwithAtMostKDistinctCharacters {
    public static int lengthOfLongestSubstringKDistinct(String s, int k) {
        if(s == null || s.length() == 0) return 0;
        int start = 0, end = 0, counter = 0, len = 0;
        int[] map = new int[128];
        while(end < s.length()) {
            if (map[s.charAt(end)] == 0) { //meet a new character
                counter++;

            } map[s.charAt(end)]++;

            if(counter <= k){  //feel free to update len
                len = Math.max(len, end - start + 1);
            }else{
                while(counter > k){    //optimization ops
                    if(map[s.charAt(start)] == 1){
                        counter--;
                    }
                    map[s.charAt(start)]--;
                    start++;
                }
                //len = Math.max(len, end - start + 1);   //no need to update
            }
            end++;
        }
        return len;
    }
    public static void main(String args[]) {
        String s = "eceab";
        int k = 2;
        int res = lengthOfLongestSubstringKDistinct(s,k);
        System.out.println(res);
    }
}
