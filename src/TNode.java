import  java.util.*;

public class TNode {
   public int value;
    public TNode left;
    public TNode right;

    public TNode() {}

    public TNode(int value,TNode left,TNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
    public static TNode creatBST(){
        TNode node5 = new TNode(5,null,null);
        TNode node1 = new TNode(1,null, null);
        TNode node3 = new TNode(3,null,null);
        TNode node2 = new TNode(2,node1,node3);
        TNode root = new TNode(4,node2,node5);
        return root;
    }
     public static void print(TNode root) {
        List<TNode> current =new ArrayList();
        int initial=16;
        if(root !=null){
            for(int i=0;i<initial;i++)
                System.out.print(" ");
            current.add(root);
            System.out.println(root.value);
        }

        while(!current.isEmpty()){
            initial=initial/2;
            for(int i=0;i<initial;i++)
                System.out.print(" ");
            List<TNode> next = new ArrayList();
            for(TNode tn:current){
                if(tn.left!=null){
                    next.add(tn.left);
                    System.out.print(" " +tn.left.value+" ");
                }else
                    System.out.print(" null ");
                for(int i=0;i<initial;i++)
                    System.out.print(" ");
                if(tn.right!=null){
                    next.add(tn.right);
                    System.out.print(" " +tn.right.value+" ");
                }else
                    System.out.print(" null ");


            }
            System.out.println();
            current=next;
        }
    }

    public static void main(String args[]) {
        TNode root = TNode.creatBST();
        TNode.print(root);
    }
}
