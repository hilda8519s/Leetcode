import java.util.*;

public class LC497RandomPointinNonOverlappingRectangles {

     private static int[][] rects;
   private static List<Integer> psum = new ArrayList<>();
  private static  int total ;
  private static  Random rand = new Random();

    public LC497RandomPointinNonOverlappingRectangles(int[][] rects) {
        this.rects = rects;

        for (int[] r : rects){
            total += (r[2] - r[0] + 1) * (r[3] - r[1] + 1);
            psum.add(total);
        }
    }

    public static int[] pick() {
        int targ = rand.nextInt(total);

        int lo = 0;
        int hi = rects.length - 1;
        while (lo != hi) {
            int mid = (lo + hi) / 2;
            if (targ >= psum.get(mid))
                lo = mid + 1;
            else
                hi = mid;
        }

        int[] p = rects[lo];
        int width = p[2] - p[0] + 1;
        int height = p[3] - p[1] + 1;
        int base = psum.get(lo) - width * height;
        return new int[]{p[0] + (targ - base) % width, p[1] + (targ - base) / width};
    }
    public static void main(String args[]){
        int[][] rects = new int[][]{{-1,-1,-2,-2},{1,0,3,0}};
        LC497RandomPointinNonOverlappingRectangles s = new LC497RandomPointinNonOverlappingRectangles(rects);
        int[] res = s.pick();
        System.out.println(Arrays.toString(res));
    }
}

