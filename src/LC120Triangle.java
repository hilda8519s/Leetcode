import java.util.*;

public class LC120Triangle {

    public static int minimumTotal(List<List<Integer>> triangle) {
        int[] total = new int[triangle.size()];
        int l = triangle.size() - 1;

        for (int i = 0; i < triangle.get(l).size(); i++) {
            total[i] = triangle.get(l).get(i);
        }

        // iterate from last second row
        for (int i = triangle.size() - 2; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i + 1).size() - 1; j++) {
                total[j] = triangle.get(i).get(j) + Math.min(total[j], total[j + 1]);
            }
        }

        return total[0];
    }
    public static void main(String args[]) {
        List<List<Integer>> triangle = new java.util.ArrayList<>();
        List<Integer> list0 = new java.util.ArrayList<>();
        list0.add(2);
        List<Integer> list1 = new java.util.ArrayList<>();
        list1.add(3);
        list1.add(4);
        List<Integer> list2 = new java.util.ArrayList<>();
        list2.add(6);
        list2.add(5);
        list2.add(7);
        triangle.add(0,list0);
        triangle.add(list1);
        triangle.add(list2);
        int min = minimumTotal(triangle);
        System.out.print(min);


    }
}
