import  java.util.*;
public class LC253MeetingRoomsII {
    public static int minMeetingRooms(Interval[] intervals) {
        if(intervals == null || intervals.length == 0)
            return 0;
        Arrays.sort(intervals,(a,b)->a.start-b.start);
        PriorityQueue<Interval> pq = new PriorityQueue<>((a,b)->a.end-b.end);
        pq.add(intervals[0]);
        for(int i=1; i<intervals.length; i++) {
            if(intervals[i].start <= pq.peek().end) {
                pq.poll();
            }
            pq.offer(intervals[i]);
        }
        return pq.size();
    }
    public static void main(String args[]) {
        //
        // Interval[] intervals = Interval.meetingroom();
        Interval[] intervals = Interval.lifeTime();
        int res = minMeetingRooms(intervals);
        System.out.println(res);
    }
}
