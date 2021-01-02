import  java.util.*;

public class LC857MinimumCosttoHireKWorkers {

    public static double mincostToHireWorkers(int[] quality, int[] wage, int K) {
        double[][] workers = new double[quality.length][2];
        for (int i = 0; i < quality.length; ++i)
            workers[i] = new double[]{(double)(wage[i]) / quality[i], (double)quality[i]};
        Arrays.sort(workers, (a, b) -> Double.compare(a[0], b[0]));
        double res = Double.MAX_VALUE, qsum = 0;
        PriorityQueue<Double> pq = new PriorityQueue<>();
        for (double[] worker: workers) {
            qsum += worker[1];
            pq.add(-worker[1]);
            if (pq.size() > K)
                qsum += pq.poll();
            if (pq.size() == K)
                res = Math.min(res, qsum * worker[0]);
        }
        return res;
    }

    public static void main(String args[]) {
        int[] q = {10,20,5};
        int[] w  ={70,50,30};
        int k = 2;
        double res = mincostToHireWorkers(q,w,k);
        System.out.println(res);

    }
}
