import java.util.*;
//import java.util.AbstractMap;
import java.util.TreeMap;
public class LC731MyCalenderII {
    private static TreeMap<Integer, Integer> map;

    public LC731MyCalenderII() {
        map = new TreeMap<>();
    }

    private static boolean book(int start, int end) {
        map.put(start, map.getOrDefault(start, 0) + 1);
        map.put(end, map.getOrDefault(end, 0) - 1);
        int count = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            count += entry.getValue();
            if(count > 2) {
                map.put(start, map.get(start) - 1);
                if(map.get(start) == 0) {
                    map.remove(start);
                }
                map.put(end, map.get(end) + 1);
                if(map.get(end) == 0) {
                    map.remove(end);
                }
                return false;
            }
        }
        return true;

    }

    public static void main(String args[]) {
        new LC731MyCalenderII();
       boolean res1 = LC731MyCalenderII.book(10,20);
       System.out.println(res1);
        boolean res2 = LC731MyCalenderII.book(50,60);
        System.out.println(res2);
        boolean res3 = LC731MyCalenderII.book(10,40);
        System.out.println(res3);
        boolean res4 = LC731MyCalenderII.book(5,15);
        System.out.println(res4);

    }
}
