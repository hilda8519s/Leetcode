import java.util.ArrayList;
import java.util.List;

public class TreeLinkNode {
    int value;
    TreeLinkNode left, right, next;

    public TreeLinkNode(int value) {

        this.value = value;
    }
    public static void print(TreeLinkNode root) {
        List<TreeLinkNode> current = new ArrayList();
        int initial = 16;
        if(root !=null){
            for(int i=0;i<initial;i++)
                System.out.print(" ");
            current.add(root);
            System.out.println(root.value+"->");
        }

        while(!current.isEmpty()){
            initial=initial/2;
            for(int i=0;i<initial;i++)
                System.out.print(" ");
            List<TreeLinkNode> next = new ArrayList();
            for(TreeLinkNode tn:current){
                if(tn.left!=null){
                    next.add(tn.left);
                    System.out.print(" " +tn.left.value+" ->");
                }else
                    System.out.print(" null ");
                for(int i=0;i<initial;i++)
                    System.out.print(" ");
                if(tn.right!=null){
                    next.add(tn.right);
                    System.out.print(" " +tn.right.value+"-> ");
                }else
                    System.out.print(" null ");


            }
            System.out.println();
            current=next;
        }
    }
    public static TreeLinkNode createBinaryTree(){
        TreeLinkNode head = new TreeLinkNode(7);
        TreeLinkNode left = new TreeLinkNode(1);
        TreeLinkNode right = new TreeLinkNode(13);
        head.left=left;
        head.right=right;
        TreeLinkNode leftRight = new TreeLinkNode(3);
        left.right=leftRight;
        TreeLinkNode rightLeft = new TreeLinkNode(11);
        TreeLinkNode rightRight = new TreeLinkNode(17);
        right.left=rightLeft;
        right.right=rightRight;
        return head;
    }
    /*public static void main(String args[]){
        TreeLinkNode.createBinaryTree();
        TreeLinkNode.print(root);
    }*/
}
