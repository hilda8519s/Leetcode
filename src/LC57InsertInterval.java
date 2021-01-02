import java.util.List;

public class LC57InsertInterval {
    public static  List<Interval> insert(List<Interval> intervals,Interval newInterval) {
        List<Interval> res = new java.util.ArrayList<Interval>();
        if(intervals.size() == 0)
        {
            res.add(newInterval);
            return res;
        }
        int i = 0;
        while(i<intervals.size() && intervals.get(i).end<newInterval.start)
        {
            res.add(intervals.get(i));
            i++;
        }
        if(i<intervals.size())
            newInterval.start = Math.min(newInterval.start, intervals.get(i).start);
            res.add(newInterval);
        while(i<intervals.size() && intervals.get(i).start<=newInterval.end)
        {
            newInterval.end = Math.max(newInterval.end,intervals.get(i).end);
            i++;
        }
        while(i<intervals.size())
        {
            res.add(intervals.get(i));
            i++;
        }
        return res;
        }

        public static void main(String args[]) {
         List<Interval> intervals = Interval.creatInterval();
            Interval.printIntervalList(intervals);
         Interval newInterval = new Interval(4,8);
         List<Interval> res = insert(intervals,newInterval);
         Interval.printIntervalList(res);
        }

}
