public class Matrix {
    //dp
	/*To solve this DP problem:

    If there's no constraint, we choose min cost for each house.
    Since house[i] and house[i - 1] cannot have the same color j, we should choose 2nd min color for house[i - 1].
    If we choose the 3rd min color for house[i - 1], we might miss potential min cost.
    min(i) = min(cost[i][j] + 1st min / 2nd min), 0 < j < n.
    Since current row only relies on last row for getting mins and avoiding same color, O(1) space is enough.

	 *
	 */
    public static int[][] prerequisites(){
        int[][] matrix = {{0,1},{2,0},{3,1},{3,2}};
        return matrix;
    }
    public static int[][] noLargerThanK(){
        int[][] matrix = {{1,0,1},{0,-2,3}};
        return matrix;
    }
    public static int[][] createMatrix22() {
        int[][] matrix ={{0,0},{1,1},{2,2},
                {3,1},{4,2},{5,0},
                {6,2},{7,0},{8,1}
        };
        return matrix;
    }

    public static int[][] createMatrix(){
        int[][] matrix={{1,2,3},
                {4,5,6},
                {7,8,9}};
        return matrix;
    }
    public static int[][] createMatrixPath(){
        int[][] matrix={{9,9,4},
                {6,6,8},
                {2,1,1}};
        return matrix;
    }
    public static int[][] createMatrix33(){
        int[][] matrix={{1,2,3},
                {4,0,6},
                {7,8,0}};
        return matrix;
    }
    public static int[][] createMatrix34(){
        int[][] matrix={{3,7,8},
                {9,11,13},
                {15,16,17}};
        return matrix;
    }
    public static int[][] createMatrix44(){
        int[][] matrix={{1,2,3,4},
                {5,6,7,8},
                {8,9,-1,-2},
                {-3,-4,-6,-7}};
        return matrix;
    }

    public static int[][] createMatrix55(){
        int[][] matrix={{1,2,3,4,5},
                {6,7,8,9,0},
                {10,11,12,13,14},
                {-1,-2,-3,-4,-5},
                {-6,-7,-8,-9,10}};
        return matrix;
    }

    public static int[][] createIslands(){
        int[][] matrix= {{1, 1, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 1, 1},
        };
        return matrix;
    }
    public static char[][] createcharIslands(){
        char[][] matrix= {{'1','1','0','0', '0'},
        {'1', '1', '0', '0', '0'},
        {'0', '0', '1', '0', '0'},
        {'0', '0', '0', '1', '1'}};
        return matrix;
    }

    public static int[][] numberOfIslands2(){
        int[][] matrix = {{0,0},{0,1},{1,2},{2,1}};
        return matrix;
    }
    public static int[][] wallsAndGates() {
        int[][] matrix = {{Integer.MAX_VALUE, -1, 0, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE, -1},
                {Integer.MAX_VALUE,-1,Integer.MAX_VALUE,-1},
                {0, -1, Integer.MAX_VALUE,Integer.MAX_VALUE}};
        return matrix;
    }
    public static int[][] gameofLifematrix(){
        int[][] matrix= {{1, 1, 0, 0, 0},
                {0, 1, 0, 1, 1},
                {0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}};
        return matrix;
    }
    public static char[][] wordsearch2(){
        char[][] matrix = {{'o','a','a','n'},
                {'e','t','a','e'},
                {'i','h','k','r'},
                {'i','f','l','v'}};
    return matrix;
    }
    public static char[][] sudoku(){
        char[][] matrix= {{'8', '2', '4', '9', '5', '3', '6', '7', '1'},
                {'6', '3', '5', '8', '1', '7', '9', '2', '4'},
                {'7', '1', '9', '6', '2', '4', '8', '5', '3'},
                {'5', '8', '7', '2', '9', '1', '3', '4', '6'},
                {'1', '4', '2', '7', '3', '6', '5', '8', '9'},
                {'3', '9', '6', '4', '8', '5', '2', '1', '7'},
                {'2', '6', '1', '5', '4', '9', '7', '3', '8'},
                {'4', '7', '8', '3', '6', '2', '1', '9', '5'},
                {'9', '5', '3', '1', '7', '8', '4', '6', '2'}
        };
        return matrix;
    }
    public static int[][] peopleHeight(){
        int[][] matrix = {{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};
        return matrix;
    }
    public static char[][] wordSearch(){
        char[][] matrix ={{'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}};
        return matrix;
    }
    public static int[][] overlap1(){
        int[][] matrix = {{1,1,0},{0,0,0},{0,1,0}};
        return matrix;
    }
    public static int[][] overlap2() {
        int[][] matrix= {{0,0,0},{0,1,1},{0,0,1}};
        return matrix;
    }
    public static void print(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++)
                System.out.print(matrix[i][j]+" ");
            System.out.println();
        }
    }
}
