import  java.util.*;
public class LC406QueueReconstructionbyHeight {
    public static int[][] reconstructQueue(int[][] people) {
        if (people == null || people.length == 0 || people[0].length == 0) {
            return new int[0][0];
        }
        List<int[]> res = new ArrayList<>();
        Arrays.sort(people, (a, b) -> (a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]));
        Matrix.print(people);
        for(int[] cur : people){
            res.add(cur[1],cur);
        }

        return res.toArray(new int[people.length][]);
    }

    public static void main(String args[]) {
        int[][] people = Matrix.peopleHeight();
        int[][] res = reconstructQueue(people);
       // Matrix.print(res);
    }
}
