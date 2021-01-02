import java.util.*;

public class TheNumCanntBeFind {

    public static int TheNumberCanntBeFind(int[] nums) {
        if(nums == null  || nums.length == 0)
            return 0;
        return helper(nums,0 ,nums.length-1,Integer.MIN_VALUE,Integer.MAX_VALUE);

    }

    private static int helper(int[] nums, int left, int right, int lower, int upper ) {

            // base case: there should be no elements between (lower, upper) or (left,right)
            if(lower >= upper)
                return right - left + 1;
            if(left > right)
                return 0;

            int mid = left + (right - left) / 2;
            int l = helper(nums, left, mid-1, lower, nums[mid]);
            int r = helper(nums, mid+1, right, nums[mid], upper);
            if(nums[mid] > lower && nums[mid] < upper) {
                return l + r;
            } else {
                return l + r + 1;
            }

        }

    public static void main(String args[]) {
        int[] nums = {2,7,9,10,1};
        int res = TheNumberCanntBeFind(nums);
        System.out.print(res);
    }
}
