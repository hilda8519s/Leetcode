import  java.util.*;

public class LC986IntervalListIntersections {
    public static int[][] intervalIntersection(int[][] A, int[][] B) {
        List<int[]> ans = new ArrayList<>();
        if(A == null || A.length == 0 || B == null || B.length == 0)
            return new int[][]{};
        int i = 0, j = 0;
        while(i< A.length&& j<B.length){
            int start = Math.max(A[i][0], B[j][0]);
            int end = Math.min(A[i][1],B[j][1]);
            if(start <= end)
                ans.add(new int[]{start, end});

            if(A[i][1]>B[j][1])
                j++;
            else
                i++;
        }

        int[][] res = new int[ans.size()][2];
       // int k = 0;
        for(int k = 0; k< ans.size();k++ ){
            res[k] = ans.get(k);


        }
        return res;

    }

    public static void main(String args[]){
        int[][] A = new int[][]{{0,2},{5,10},{13,23},{24,25}};
        int[][] B = new int[][]{{1,5},{8,12},{15,24},{25,26}};
        int[][] res = intervalIntersection(A,B);
        for(int[] r:res) {
            System.out.print(Arrays.toString(r));
        }

    }
}
