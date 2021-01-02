import java.util.*;

public class LC42TrappingRainWater {

    public static int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int res = 0;
        int leftmax = 0, rightmax = 0;
        while(left < right){
            if(height[left] < height[right]) {
                leftmax = Math.max(height[left], leftmax);

                res += leftmax - height[left];
                left++;
            } else {
                rightmax = Math.max(height[right], rightmax);
                res += rightmax - height[right];
                right--;
            }
        }
        return res;
    }
    public static void main(String args[]) {
        int[] height = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        int res = trap(height);
        System.out.println(res);
    }
}
