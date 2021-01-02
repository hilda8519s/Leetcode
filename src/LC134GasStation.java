public class LC134GasStation {
    public static  int canCompleteCircuit(int[] gas, int[] cost) {
        int debt = 0, remain = 0;
        int start = 0;
        for (int i = 0; i < gas.length; i++) {
            remain += gas[i] - cost[i];
            if (remain < 0) {
                debt += remain;
                start = i + 1;
                remain = 0;
            }
        }
        return remain + debt < 0 ? -1 : start;
    }

    public static void main(String args[]) {
        int[] gas = {1,2,3,4,5,6};
        int[] cost = {3,4,5,6,1,2};
        int res = canCompleteCircuit(gas, cost);
        System.out.println(res);
    }
}
