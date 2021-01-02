import java.util.*;
public class LC5356LuckyNumber {
    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int i = 0 ;i< matrix.length; i++)  {
            int min = matrix[i][0];
            for(int j = 1; j < matrix[0].length; j++) {
                if(matrix[i][j] < min) {
                    min = matrix[i][j];

                }
                set.add(min);
            }

        }
        for(int i = 0; i< matrix[0].length; i++) {
            int max = matrix[0][i];
            for(int j = 1; j <matrix.length; j++) {
                if(matrix[j][i] > max)
                    max = matrix[j][i];

            }
            if(set.contains(max))
                res.add(max);
        }
        return res;

    }
    public static void main(String args[]) {
        int[][] matrix = Matrix.createMatrix34();
        Matrix.print(matrix);
        List<Integer> res = luckyNumbers(matrix);
        System.out.println(Arrays.asList(res));
    }
}
