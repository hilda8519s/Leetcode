import  java.util.*;

public class DirectedGraphNode {

     public  int label;
     public ArrayList<DirectedGraphNode> neighbors;
     public     DirectedGraphNode(int x) {
     label = x;
     neighbors = new ArrayList<DirectedGraphNode>();
 }

 public static List<DirectedGraphNode> creatGraph(){
         DirectedGraphNode node0 = new DirectedGraphNode(0);
         DirectedGraphNode node1 = new DirectedGraphNode(1);
         DirectedGraphNode node2 = new DirectedGraphNode(2);
         DirectedGraphNode node3 = new DirectedGraphNode(3);
         DirectedGraphNode node4 = new DirectedGraphNode(4);
         DirectedGraphNode node5 = new DirectedGraphNode(5);

         node0.neighbors.add(node1);
     node0.neighbors.add(node2);
     node0.neighbors.add(node3);
     node1.neighbors.add(node4);
     node2.neighbors.add(node4);
     node2.neighbors.add(node5);
     node3.neighbors.add(node4);
     node3.neighbors.add(node5);
     return node0.neighbors;
 }
    public static List<DirectedGraphNode> topSort(List<DirectedGraphNode> graph) {
        // write your code here
        List<DirectedGraphNode> result = new ArrayList<DirectedGraphNode>();
        HashMap<DirectedGraphNode, Integer> map = new HashMap();
        for (DirectedGraphNode node : graph) {
            for (DirectedGraphNode neighbor : node.neighbors) {
                if (map.containsKey(neighbor)) {
                    map.put(neighbor, map.get(neighbor) + 1);
                } else {
                    map.put(neighbor, 1);
                }
            }
        }
        Queue<DirectedGraphNode> q = new LinkedList<DirectedGraphNode>();
        for (DirectedGraphNode node : graph) {
            if (!map.containsKey(node)) {
                q.offer(node);
                result.add(node);
            }
        }
        while (!q.isEmpty()) {
            DirectedGraphNode node = q.poll();
            for (DirectedGraphNode n : node.neighbors) {
                map.put(n, map.get(n) - 1);
                if (map.get(n) == 0) {
                    result.add(n);
                    q.offer(n);
                }
            }
        }
        return result;
    }
 public static void main(String args[]){
         List<DirectedGraphNode> graph = DirectedGraphNode.creatGraph();
         List<DirectedGraphNode> toposort = topSort(graph);
         for(DirectedGraphNode n: toposort){
             System.out.println(n.label);
         }


 }
}
