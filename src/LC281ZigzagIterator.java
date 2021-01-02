import java.util.*;

public class LC281ZigzagIterator {
    static LinkedList<Iterator> list;
    public LC281ZigzagIterator(List<Integer> v1, List<Integer> v2) {
        list = new LinkedList<Iterator>();
        if(!v1.isEmpty())
            list.add(v1.iterator());
        if(!v2.isEmpty())
            list.add(v2.iterator());
    }

    public static int next() {
        Iterator poll = list.remove();
        int result = (Integer)poll.next();
        if(poll.hasNext())
            list.add(poll);
        return result;
    }

    public static boolean hasNext() {
        return !list.isEmpty();
    }


    public static void main(String args[]) {
        List<Integer> v1 = new java.util.ArrayList<>();
        v1.add(1);
        v1.add(2);
        List<Integer> v2 = new java.util.ArrayList<>();
        v2.add(3);
        v2.add(4);
        v2.add(5);
        v2.add(6);
        LC281ZigzagIterator i = new LC281ZigzagIterator(v1,v2);
        while(i.hasNext()) {
            int v = i.next();
            System.out.println(v);
        }


    }
}
