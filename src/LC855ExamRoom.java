import java.util.*;
import java.util.TreeSet;
public class LC855ExamRoom {

        int N;
        TreeSet<Integer> treeSet;

        public LC855ExamRoom(int N) {
            this.N = N;
            treeSet = new TreeSet();
        }

        private int seat() {
            //Let's determine student, the position of the next
            //student to sit down.
            int student = 0;
            if (treeSet.size() > 0) {
                //Tenatively, dist is the distance to the closest student,
                //which is achieved by sitting in the position 'student'.
                //We start by considering the left-most seat.
                int dist = treeSet.first();
                Integer prev = null;
                for (Integer s: treeSet) {
                    if (prev != null) {
                        //For each pair of adjacent students in positions (prev, s),
                        //d is the distance to the closest student;
                        //achieved at position prev + d.
                        int d = (s - prev) / 2;
                        if (d > dist) {
                            dist = d;
                            student = prev + d;
                        }
                    }
                    prev = s;
                }

                //Considering the right-most seat.
                if (N - 1 - treeSet.last() > dist)
                    student = N - 1;
            }

            //Add the student to our sorted TreeSet of positions.
            treeSet.add(student);
            return student;
        }

        private void leave(int p) {
            treeSet.remove(p);
        }

        public static void main(String args[]) {

            LC855ExamRoom room = new LC855ExamRoom(10);
           int s1 =  room.seat();
            System.out.print(s1);
            int s2 = room.seat();
            System.out.print(s2);
            int s3 = room.seat();
            System.out.print(s3);
            int s4 = room.seat();
            System.out.print(s4);
            room.leave(s3);
            int s5 = room.seat();
            System.out.print(s5);
        }

}
