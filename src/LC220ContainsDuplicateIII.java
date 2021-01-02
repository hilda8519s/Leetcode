import java.util.TreeSet;
public class LC220ContainsDuplicateIII {
    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if(k<1 || t < 0)
            return false;

 TreeSet<Integer> set = new TreeSet<Integer>();
  System.out.println(1);

        for (int i = 0; i < nums.length; ++i) {
            // Find the successor of current element
            System.out.println(1);
            Integer s = set.ceiling(nums[i]);
            System.out.println(1);
            if (s != null && s <= nums[i] + t)
                return true;

            // Find the predecessor of current element
            Integer g = set.floor(nums[i]);
            if (g != null && nums[i] <= g + t)
                return true;

            set.add(nums[i]);
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;

    }
    public static void main(String args[]) {
        int[] nums = {1,2,3,1};
        int k = 3;
        int t = 0;
        boolean res  = containsNearbyAlmostDuplicate(nums,k,t);
        System.out.println(res);
    }
}
