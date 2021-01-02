import  java.util.*;
public class LC363MaxSumofRectangleNoLargerThanK {
    public static int maxSumSubmatrix(int[][] matrix, int k) {
        if (matrix.length == 0)
            return 0;

        int m = matrix.length;
        int n = matrix[0].length;
        int res = Integer.MIN_VALUE;

        for (int left = 0; left < n; left++) {
            int[] sums = new int[m];
            for (int right = left; right < n; right++) {
                for (int i = 0; i < m; i++) {
                    sums[i] += matrix[i][right];
                }
                java.util.TreeSet<Integer> set = new java.util.TreeSet<Integer>();
                set.add(0);
                int cur = 0;
                for (int sum : sums) {
                    cur += sum;
                    Integer num = set.ceiling(cur - k);
                    if (num != null) {
                        res = Math.max(res, cur - num);
                    }
                    set.add(cur);
                }
            }
        }
        return res;
    }

    public static void main(String args[]) {
        int[][] m = Matrix.noLargerThanK();
        int k = 2;
        int res = maxSumSubmatrix(m,k);
        System.out.println(res);
    }
}
