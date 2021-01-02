import java.util.*;
public class LC957PrisonCellsAfterNDays {
    public static int[] prisonAfterNDays(int[] cells, int N) {
        Map<String, Integer> map = new HashMap<>();

        while(N > 0) {
            int[] cells2 = new int[8];
            map.put(Arrays.toString(cells), N--);

            for(int i = 1; i < 7; i++)
                cells2[i] = (cells[i-1]  == cells[i+1] ? 1 : 0);
            System.out.println("this is cell2" +Arrays.toString(cells2));
            System.out.println("this is N "+N);
            cells = cells2;
            if(map.containsKey(Arrays.toString(cells))) {
                System.out.println("this is "+N);
                N %= map.get(Arrays.toString(cells))-N;
                System.out.println("this is "+N);
            }

        }
        return cells;

    }
    public static void main(String args[]) {
        int[] cells = new int[]{0,1,0,1,1,0,0,1};
        int N = 20;
        int[] res = prisonAfterNDays(cells,N);
        System.out.println("this is res : "+Arrays.toString(res));

    }
}
