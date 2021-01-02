import java.util.*;

public class LC295FindMedianfromDataStream {
   static PriorityQueue<Integer> max;//lower half
    static PriorityQueue<Integer> min;//higher half

    public LC295FindMedianfromDataStream(){
        max = new PriorityQueue<Integer>(Collections.reverseOrder());
        min = new PriorityQueue<Integer>();
    }

    // Adds a number into the data structure.
    public static void addNum(int num) {
        max.offer(num);
        min.offer(max.poll());

        if(max.size() < min.size()){
            max.offer(min.poll());
        }
    }

    // Returns the median of current data stream
    public static double findMedian() {
        if(max.size()==min.size()){
            return (double)(max.peek()+min.peek())/2;
        }else{
            return max.peek();
        }
    }
public static void main(String args[]) {
        LC295FindMedianfromDataStream median = new LC295FindMedianfromDataStream();
        median.addNum(2);
        median.addNum(3);
       System.out.println( median.findMedian());
}

}

