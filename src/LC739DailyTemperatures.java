import java.util.*;

public class LC739DailyTemperatures {
    public static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] ret = new int[temperatures.length];
        for(int i = 0; i < temperatures.length; i++) {
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int idx = stack.pop();
                ret[idx] = i - idx;
            }
            stack.push(i);
        }
        return ret;
    }

    public static void main(String args[]) {
        int[] t = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] res = dailyTemperatures(t);
        System.out.println(Arrays.toString(res));
    }
}
