import java.util.*;

public class LC1366RankTeamsbyVotes {

    public static String rankTeams(String[] votes) {
        Map<Character, int[]> rank = new HashMap<>();
        int n = votes[0].length();


        for(String v : votes) {
            for(int i =0; i<n;i++) {
                char c = v.charAt(i);
                rank.putIfAbsent(c, new int[n]);
                rank.get(c)[i]++;


            }
        }
        List<Character> list = new ArrayList<>(rank.keySet());
        Collections.sort(list, (a,b)->{
            for(int i = 0; i< n;i++) {
                if(rank.get(a)[i] != rank.get(b)[i]) {
                    return rank.get(b)[i] - rank.get(a)[i];
                }
            }
            return a-b;
        });

        StringBuilder sb = new StringBuilder();
        for(char c : list) {
            sb.append(c);
        }
        return sb.toString();

    }

    public static void main(String args[]) {
        String[] votes = new String[]{"WXYZ","XYZW"};
        String res = rankTeams(votes);
        System.out.println(res);
    }
}
