import  java.util.*;
public class TreeMap {
    public static void main(String args[]) {
       Map<Integer, String> treeMap = new java.util.TreeMap<Integer,String>();
        treeMap.put(10, "10");
        treeMap.put(85, "85");
        treeMap.put(15, "15");
        treeMap.put(70, "70");
        treeMap.put(20, "20");
        treeMap.put(60, "60");
        treeMap.put(30, "30");
        treeMap.put(50, "50");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
             System.out.println(entry.getKey() + ":" + entry.getValue());
             }
         }


}
