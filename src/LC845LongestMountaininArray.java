import java.util.*;


public class LC845LongestMountaininArray {
    public static int longestMountain(int[] A) {
        int N = A.length;
        int res = 0, left = 0;
        while (left < N) {
            int right = left;
            // if base is a left-boundary
            if (right + 1 < N && A[right] < A[right + 1]) {
                // set end to the peak of this potential mountain
                while (right + 1 < N && A[right] < A[right + 1])
                    right++;

                // if end is really a peak..
                if (right + 1 < N && A[right] > A[right + 1]) {
                    // set end to the right-boundary of mountain
                    while (right + 1 < N && A[right] > A[right + 1])
                        right++;
                    // record candidate answer
                    res = Math.max(res,right - left + 1);
                }
            }

            left = Math.max(right, left + 1);
        }

        return res;
    }

    public static void main(String args[]){
        int[] A = new int[]{2,1,4,7,3,2,5};
        int res = longestMountain(A);
        System.out.println(res);
    }
}
