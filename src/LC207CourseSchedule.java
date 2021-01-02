import java.util.*;
public class LC207CourseSchedule {
   /* public static boolean canFinish(int numCourses, int[][] prerequisites) {
        if(prerequisites == null) {
            throw new IllegalArgumentException("illegal prerequisites array");
        }

        int len = prerequisites.length;

        if(numCourses == 0 || len == 0) {
            return true;
        }

        int[] pCounter = new int[numCourses];
        for(int i = 0; i < len; i++) {
            pCounter[prerequisites[i][0]]++;
        }

        LinkedList<Integer> queue = new LinkedList<Integer>();
        for(int i = 0; i < numCourses; i++) {
            if(pCounter[i] == 0) {
                queue.add(i);
            }
        }

        int numNoPre = queue.size();

        while(!queue.isEmpty()) {
            int top = queue.remove();
            for(int i = 0; i < len; i++) {
                if(prerequisites[i][1] == top) {
                    pCounter[prerequisites[i][0]]--;
                    if(pCounter[prerequisites[i][0]] == 0) {
                        numNoPre++;
                        queue.add(prerequisites[i][0]);
                    }
                }
            }
        }
        return numNoPre == numCourses;
    }*/
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
    List[] edges = new ArrayList[numCourses];
    int[] degree = new int[numCourses];

        for (int i = 0;i < numCourses; i++)
           edges[i] = new ArrayList<Integer>();

        for (int i = 0; i < prerequisites.length; i++) {
        degree[prerequisites[i][0]] ++ ;
        System.out.println("degree is "+Arrays.toString(degree));
        edges[prerequisites[i][1]].add(prerequisites[i][0]);
            System.out.println("edges is" +Arrays.toString(edges));

    }

    Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < degree.length; i++){
        if (degree[i] == 0) {
            queue.add(i);
        }
    }

    int count = 0;
        while(!queue.isEmpty()){
        int course = (int)queue.poll();
        System.out.println("course is"  +course);
        count ++;
            System.out.println("count is"  +count);
        int n = edges[course].size();
        for(int i = 0; i < n; i++){
            int pointer = (int)edges[course].get(i);
            degree[pointer]--;
            System.out.println("degree is "+Arrays.toString(degree));
            if (degree[pointer] == 0) {
                queue.add(pointer);
            }
        }
    }

        return count == numCourses;
}

    public  static  void main(String args[]) {
        int n = 3;
        int[][] pre = {{0,1},{0,2}};
        boolean res = canFinish(n,pre);
        System.out.println(res);

    }
}
