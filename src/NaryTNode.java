import java.util.*;

public class NaryTNode {
    public static int value;
    public static List<NaryTNode> children;
    public NaryTNode(){

    }
    public NaryTNode(int value, List<NaryTNode> children){
        this.value = value;
        this.children = children;
    }

    public static NaryTNode creatNaryTree(){
        NaryTNode node5 = new NaryTNode(5,null);
        NaryTNode node6 = new NaryTNode(6,null);

        List<NaryTNode> list1 = new java.util.ArrayList<>(){};
        list1.add(node5);
        list1.add(node6);
        NaryTNode node2 = new NaryTNode(2,null);
        NaryTNode node4 = new NaryTNode(4,null);
        NaryTNode node3 = new NaryTNode(3,list1);
        List<NaryTNode> list2 = new ArrayList<>();
        list2.add(node3);
        list2.add(node2);
        list2.add(node4);
        NaryTNode root = new NaryTNode(1,list2);
        return root;
    }
   /* public static List<List<Integer>> print(NaryTNode node){

        List<List<Integer>> ans = new ArrayList<>();
        if(node == null)
            return ans;
        Queue<NaryTNode> q = new LinkedList<>();
        q.offer(node);
        while(!q.isEmpty()) {
            int size = q.size();
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < size; i++) {
                NaryTNode cur = q.poll();
                list.add(cur.value);
                for(NaryTNode child : cur.children) {
                    q.offer(child);
                }
            }
            ans.add(list);
        }
       return ans;

        }*/


    public static void main(String args[]) {
        NaryTNode root = NaryTNode.creatNaryTree();
       // List<List<Integer>> ans = print(root);

        //for(List<Integer> l : ans){
            //for(Integer a : l){
           //     System.out.print(a+" ");
            //}
            //System.out.println();
        }
    }


