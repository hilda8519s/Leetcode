import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
public class Interval {
    int start;
    int end;
    public Interval() {
        start = 0;
        end = 0;
    }
    public Interval(int start, int end) {
        this.start = start;
        this.end = end;

    }

    public static  Interval[] creatIntervalList() {
        Interval[] intervals = new Interval[3];
        intervals[0] = new Interval(0,10);
        intervals[1] = new Interval(5,20);
        intervals[2] = new Interval(25,35);
        //for (int i = 0; i < intervals.length; i++)
        //  System.out.println(intervals[i]);
        //System.out.println();
        return intervals;
    }
    public static  Interval[] lifeTime() {
        Interval[] intervals = new Interval[4];
        intervals[0] = new Interval(1920,1999);
        intervals[1] = new Interval(1921,1996);
        intervals[2] = new Interval(1997,1998);
        intervals[3] = new Interval(1999,2004);
        return  intervals;
    }
    public static  Interval[]  meetingroom() {
        Interval[] intervals = new Interval[3];
        intervals[0] = new Interval(0,30);
        intervals[1] = new Interval(5,10);
        intervals[2] = new Interval(15,20);
        //for (int i = 0; i < intervals.length; i++)
        //  System.out.println(intervals[i]);
        //System.out.println();
        return intervals;
    }
    public static List<Interval> creatInterval() {
        List<Interval> intervals = new LinkedList<>();
        Interval interval1 =  new Interval(0,5);
        Interval interval2 =  new Interval(10,13);
        intervals.add(interval1);
        intervals.add(interval2);
        return intervals;

    }

    public static void printInterval(Interval[] interval) {
        for(int i = 0; i< interval.length; i++)
            System.out.print("[" + interval[i].start+","+interval[i].end+"],");
        System.out.println();

    }

    public static void printIntervalList(List<Interval> intervals) {
        for(int i = 0; i< intervals.size(); i++) {
             System.out.print("[" + intervals.get(i).start+","+intervals.get(i).end+"],");
             System.out.println();
        }
    }
    public class AscendingComp implements Comparator<Interval> {
        public int compare(Interval a, Interval b) {
            return a.start - b.start;
        }
    }
//public static void printIntervalslist(List<Interval> interval) {
//	for(int i = 0; i< interval.size();i++)
//		System.out.print(Arrays.asList(interval[i].start) +","+interval[i].end );

//}

}




