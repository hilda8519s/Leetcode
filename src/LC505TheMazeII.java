import java.util.*;
public class LC505TheMazeII {

    static int[][] dirs = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public static int shortestDistance(int[][] maze, int[] s, int[] e) {
        int rows = maze.length, cols = maze[0].length;
        int[][] dist = new int[rows][cols];
        for (int[] row : dist) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        dist[s[0]][s[1]] = 0;
        dfs(maze, s, dist);
        return dist[e[0]][e[1]] == Integer.MAX_VALUE ? -1 : dist[e[0]][e[1]];


    }

    private static void dfs(int[][] maze, int[] s, int[][] dist) {
        for (int[] dir : dirs) {
            int x = s[0] + dir[0];
            int y = s[1] + dir[1];
            int count = 0;

            while (x >= 0 && x < maze.length && y >= 0 && y < maze[0].length && maze[x][y] == 0) {
                x += dir[0];
                y += dir[1];
                count++;
            }
            if (dist[s[0]][s[1]] + count < dist[x - dir[0]][y - dir[1]]) {
                dist[x - dir[0]][y - dir[1]] = dist[s[0]][s[1]] + count;
                dfs(maze, new int[]{x - dir[0], y - dir[1]}, dist);
            }
        }
    }
public static void main(String args[]) {
        int[][] maze = Matrix.overlap2();
        int[] s = new int[] {0,2};
        int[] e = new int[]{2,0};
        int res = shortestDistance(maze,s,e);
        System.out.println(res);

}
}
