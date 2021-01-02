import  java.util.*;

public class LC773SlidingPuzzle {

    public static int slidngPuzzle(int[][] board) {
        int row = board.length;
        int col = board[0].length;
        Set<String> visited = new HashSet<>();
        int[][] dirs = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};

        String curr = "";
        for(int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                curr += board[i][j];
            }
        }
        if (curr.equals("123450"))
            return 0;

        Queue<String> queue = new LinkedList<>();
        queue.add(curr);
        visited.add(curr);
        int minLen = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                String currStr = queue.poll();
                int index = currStr.indexOf('0');
                for (int i = 0; i < dirs.length; i++) {
                    int m = index/col + dirs[i][0];
                    int n = index%col + dirs[i][1];
                    if (m >= 0 && m < row && n >= 0 && n < col) {
                        int nextIndex = m*col + n;
                        String nextStr = swap(currStr, index, nextIndex);
                        if (nextStr.equals("123450"))
                            return minLen;
                        if (!visited.contains(nextStr)) {
                            queue.add(nextStr);
                            visited.add(nextStr);
                        }
                    }
                }
            }
            minLen++;
        }
        return -1;
    }

    private static String swap(String s, int i , int j){
        char[] charArray = s.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return new String(charArray);
    }

    public static void main(String args[]){
        int[][] board = new int[][] {{1,2,3},{4,0,5}};
        int res = slidngPuzzle(board);
        System.out.println(res);

    }
}
