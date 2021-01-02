import java.util.*;

public class LC760FindAnagramMappings {
    public static int[] anagramMappings(int[] A, int[] B) {
        int[] res = new int[A.length];
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0;i < B.length; i++){
            map.computeIfAbsent(B[i], k->new ArrayList<>()).add(i);
        }
        for(int i = 0; i< A.length; i++){
            res[i] = map.get(A[i]).remove(map.get(A[i]).size() - 1);
        }
        return res;
    }

    public static void main(String args[]) {
        int[] A = {12,28,46,32,50,12};
        int[] B = {50,12,32,46,12,28};
        int[] res = anagramMappings(A,B);
        System.out.println(Arrays.toString(res));
    }

}
