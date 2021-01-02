public class LC128LongestConsecutiveSequence {

    public static int longestConsecutiveSequence(int[] nums) {
        int res = 0;
        java.util.Map<Integer, Integer> findLength = new java.util.HashMap<>();
        for(int n : nums) {
             if(!findLength.containsKey(n)) {
                 int leftlength = findLength.containsKey(n-1)? findLength.get(n-1):0;
                 int rightlength = findLength.containsKey(n+1)? findLength.get(n+1):0;
                 // sum: length of the sequence n is in
                 int length = leftlength+ rightlength +1;
                 findLength.put(n,length);

                 // keep track of the max length
                 res = Math.max(res,length);
                 // extend the length to the boundary(s) of the sequence
                 // will do nothing if n has no neighbors
                 findLength.put(n-leftlength, length);
                 findLength.put(n+rightlength,length);
             }
             else {
                 continue;
             }
        }
        return res;
    }

}
