import java.util.*;
public class LC795NumberofSubarrayswithBoundedMaximum {
    public static int numSubarrayBoundedMax(int[] A, int L, int R) {
        int start = -1, last = -1, res = 0;
        for(int i = 0; i < A.length; i++) {
            if(A[i] > R) {
                start = last = i;
                continue;
            }

            if(A[i] >= L)
                last = i;

            res += last - start;
        }

        return res;
    }

    public static void main(String args[]) {
        int[] A = new int[]{2,1,4,3};
        int L = 2;
        int R = 3;
        int res = numSubarrayBoundedMax(A, L, R);
        System.out.println(res);
    }
}
