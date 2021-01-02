
import  java.util.*;
public class LC853CarFleet {

    public static int carFleet(int target, int[] position, int[] speed) {
        java.util.TreeMap<Integer, Double> map = new java.util.TreeMap<Integer,Double>();
        for (int i = 0; i < position.length; ++i)
            map.put(-position[i], (double)(target - position[i]) / speed[i]);
        int res = 0;
        double cur = 0;
        for (double time : map.values()) {
            if (time > cur) {
                cur = time;
                res++;
            }
        }
        return res;
    }

    public static  void main(String args[]) {
        int target = 12;
        int[] pos = {10,8,0,5,3};
        int[] speed = {2,4,1,1,3};
        int res = carFleet(target,pos,speed);
        System.out.println(res);

    }
}
