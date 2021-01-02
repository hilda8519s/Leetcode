import java.util.*;
public class LC2593SumSmaller {
    public static int threeSumSmaller(int[] nums, int target) {
        if(nums == null || nums.length == 0)
            return 0;
        Arrays.sort(nums);
        int count = 0;

        for(int i = 0; i < nums.length - 2; i++) {
            int lo = i + 1, hi = nums.length - 1;
            while(lo < hi) {
                if(nums[i] + nums[lo] + nums[hi] < target) {
                    count += hi - lo;
                    lo++;
                } else {
                    hi--;
                }
            }
        }

        return count;
    }
    public static  void main(String args[]){
        int[] nums = new int[]{-2,0,1,3};
        int target = 2;
        int res = threeSumSmaller(nums,target);
        System.out.println(res);
    }
}
