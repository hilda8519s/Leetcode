import java.util.*;
public class LC287FindtheDuplicateNumber {

    public static int findDuplicate(int[] nums) {
        if (nums.length > 1){
            int slow = nums[0];
            int fast = nums[nums[0]];
            while (slow != fast)
            {
                slow = nums[slow];
                fast = nums[nums[fast]];
            }

            fast = 0;
            while (fast != slow)
            {
                fast = nums[fast];
                slow = nums[slow];
            }
            return slow;
        }
        return -1;
    }

    public static void main(String args[]){
        int[] nums = new int[]{1,2,2,2,2};
        int res = findDuplicate(nums);
        System.out.println(res);
    }
}
