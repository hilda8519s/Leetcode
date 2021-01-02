import java.util.*;

public class LC444SequenceReconstruction {
    public static boolean sequenceReconstruction(int[] org, List<List<Integer>> seqs) {
        int idx[] = new int[org.length + 1];
        int res = org.length - 1;
        for (int i = 0; i < org.length; i++) {
            idx[org[i]] = i;
        }
        boolean seen[] = new boolean[org.length + 1];
        boolean isEmpty = true;
        for (List<Integer> seq : seqs) {
            for (int i = 0; i < seq.size(); i++) {
                isEmpty = false;
                int cur = seq.get(i);
                if (cur < 1 || cur > org.length) {
                    return false;
                }
                if (i == 0) continue;
                int prev = seq.get(i - 1);
                if (idx[prev] + 1 == idx[cur]) {
                    if (!seen[prev]) {
                        seen[prev] = true;
                        res--;
                    }
                } else if (idx[prev] >= idx[cur]) {
                    return false;
                }
            }
        }
        return res == 0 && !isEmpty;
    }
    public static void main(String args[]) {
         int[] org = {1,2,3};
         List<List<Integer>> seqs = new java.util.ArrayList<>();
         List<Integer> list1 = new java.util.ArrayList<>();
         list1.add(1);list1.add(2);
         List<Integer> list2 = new java.util.ArrayList<>();
         list2.add(1);list2.add(3);
         List<Integer> list3 = new java.util.ArrayList<>();
         list3.add(2);
         list3.add(3);
         seqs.add(list1);
         seqs.add(list2);
         seqs.add(list3);
         boolean res = sequenceReconstruction(org,seqs);
         System.out.println(res);
    }
}
