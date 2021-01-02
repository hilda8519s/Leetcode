import java.util.*;
public class LC5400DestiantionCities {
   public static String destCity(List<List<String>> paths){
    Deque<String> deque = new LinkedList<>();
    if(paths == null)
        return null;
    deque.addFirst(paths.get(0).get(0));
    deque.addLast(paths.get(0).get(1));
    Set<String> set = new HashSet<>();
    set.add(paths.get(0).get(0));
    set.add(paths.get(0).get(1));
    for(int i = 1; i< paths.size(); i++) {
        String s0 = paths.get(i).get(0);
        String s1 = paths.get(i).get(1);
        if(s0 == deque.getLast() && !set.contains(s0)) {
            deque.addLast(s1);
            set.add(s0);
        }
        if(paths.get(i).get(1) == deque.getFirst()){
            deque.addFirst(paths.get(i).get(0));
        }
        if(paths.get(i).get(0) == deque.getFirst()){
            deque.addFirst(paths.get(i).get(0));
        }
        for(String s : deque) {
            System.out.print(" "+s);
        }
    }

    return deque.getLast();
   }


   public static void main(String args[]) {
       List<String> p1 = new ArrayList<>();
       p1.add("London");
       p1.add("New York");
       List<String> p2 = new ArrayList<>();
       p2.add("New York");
       p2.add("Lima");
       List<String> p3 = new ArrayList<>();
       p3.add("Lima");
       p3.add("San Paulo");
       List<List<String>> paths = new ArrayList<>();
       paths.add(p1);
       paths.add(p2);
       paths.add(p3);
       for(List<String> p : paths) {
           System.out.println(p);
       }
       String res = destCity(paths);
       //System.out.println("the result is"+res);
   }
}
