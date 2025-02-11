import  java.util.*;
public class LC210CourseScheduleII {
    public static int[] findOrder(int numCourses, int[][] prerequisites) {
        if (numCourses == 0)
            return null;
        // Convert graph presentation from edges to indegree of adjacent list.
        int indegree[] = new int[numCourses], order[] = new int[numCourses], index = 0;
        for (int i = 0; i < prerequisites.length; i++) // Indegree - how many prerequisites are needed.
            indegree[prerequisites[i][0]]++;
        System.out.println("indegree " + Arrays.toString(indegree));

        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i = 0; i < numCourses; i++)
            if (indegree[i] == 0) {
                // Add the course to the order because it has no prerequisites.
                order[index++] = i;
                System.out.println("order " + Arrays.toString(order));

                queue.offer(i);
            }

        // How many courses don't need prerequisites.
        while (!queue.isEmpty()) {
            int prerequisite = queue.poll(); // Already finished this prerequisite course.
            for (int i = 0; i < prerequisites.length; i++)  {
                if (prerequisites[i][1] == prerequisite) {
                    indegree[prerequisites[i][0]]--;
                    System.out.println("Indegree " + Arrays.toString(indegree));

                    if (indegree[prerequisites[i][0]] == 0) {
                        // If indegree is zero, then add the course to the order.
                        order[index++] = prerequisites[i][0];
                        System.out.println("Order " + Arrays.toString(order));
                        queue.offer(prerequisites[i][0]);
                    }
                }
            }
        }

        return (index == numCourses) ? order : new int[0];
    }
    public static void main(String args[]) {
        int n = 3;
        int[][] prerequisites = new int[][] {{0,1},{0,2}};
        int[] res = findOrder(n,prerequisites);
        System.out.println(Arrays.toString(res));
    }

}
