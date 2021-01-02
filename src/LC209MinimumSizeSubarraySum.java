import  java.util.*;

public class LC209MinimumSizeSubarraySum {
    public static  int minSubArrayLen(int s, int[] nums) {
        if (nums.length == 0) return 0;

        int[] sums = new int[nums.length];
        sums[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sums[i] = sums[i - 1] + nums[i];
        }
        if (sums[nums.length - 1] < s)
            return 0;

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int left = i;
            int right = nums.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (sums[mid] - sums[i] + nums[i] == s) {
                    left = mid;
                    break;
                } else if (sums[mid] - sums[i] + nums[i] < s) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            if (left >= sums.length)
                break;
            ans = Math.min(ans, left - i + 1);
        }

        return (ans == Integer.MAX_VALUE ? 0 : ans);
    }

    public static void main(String args[]){
        int[] nums = new int[] {2,3,1,2,4,3};
        int s = 7;
        int res = minSubArrayLen(s,nums);
        System.out.println(res);
    }
}
