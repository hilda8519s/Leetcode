import  java.util.*;
public class LC785IsGraphBipartite {
    public static boolean isBipartite(int[][] graph) {

        int n = graph.length;
        int[] colors = new int[n];
        Arrays.fill(colors, -1);

        for (int i = 0; i < n; i++) {
            //This graph might be a disconnected graph. So check each unvisited node.
            if (colors[i] == -1 && !validColor(graph, colors, 0, i)) {
                return false;
            }
        }
        return true;
    }

    private static boolean validColor(int[][] graph, int[] colors, int color, int node) {
        if (colors[node] != -1) {
            return colors[node] == color;
        }
        colors[node] = color;
        for (int next : graph[node]) {
            if (!validColor(graph, colors, 1 - color, next)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        int[][] graph = new int[][]{{1,2,3},{0,2},{0,1,3},{0,2}};
        boolean res = isBipartite(graph);
        System.out.println(res);
    }
}
