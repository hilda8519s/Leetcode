import java.util.*;

import java.util.stream.Collectors;

public class LC465OptimalAccountBalancing {

    public static int minTransfers(int[][] transactions) {
        Map<Integer, Integer> personToDebt = new HashMap<>();
        for (int[] t : transactions) {
            personToDebt.put(t[0], personToDebt.getOrDefault(t[0], 0) - t[2]);
            personToDebt.put(t[1], personToDebt.getOrDefault(t[1], 0) + t[2]);
        }
        List<Integer> debts = personToDebt.values()
                .stream()
                // People with no debt can just stay alone
                .filter(d -> d != 0)
                .collect(Collectors.toList());
        System.out.println(debts.listIterator());
        return dfs(debts, 0);
    }

    private static int dfs(List<Integer> debts, int start) {
        while (start < debts.size() && debts.get(start) == 0) {
            start++;
        }

        if (start == debts.size()) {
            return 0;
        }

        int ret = Integer.MAX_VALUE;
        for (int i = start + 1; i < debts.size(); i++) {
            if (debts.get(start) * debts.get(i) < 0) {
                debts.set(i, debts.get(i) + debts.get(start));
                ret = Math.min(ret, 1 + dfs(debts, start + 1));
                // Backtracking, have to set the value back
                debts.set(i, debts.get(i) - debts.get(start));
            }
        }
        return ret;
    }
    public static void main(String args[]) {
        int[][] trans = new int[][]{{0,1,10}, {2,0,5}};
        int res = minTransfers(trans);
        System.out.println(res);
    }

}

