import java.util.ArrayList;
import java.util.List;

public class TreeNode {
    public TreeNode left;
    public TreeNode right;
    public int value;
    public TreeNode(int value){

        this.value=value;
    }


    public static void print(TreeNode root) {
        List<TreeNode> current =new ArrayList();
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
            List<TreeNode> next = new ArrayList();
            for(TreeNode tn:current){
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

    public static TreeNode createBinarySearchTree(){
        TreeNode head = new TreeNode(7);
        TreeNode left = new TreeNode(1);
        TreeNode right = new TreeNode(13);
        head.left=left;
        head.right=right;
        TreeNode leftRight = new TreeNode(3);
        left.right=leftRight;
        TreeNode rightLeft = new TreeNode(11);
        TreeNode rightRight = new TreeNode(17);
        right.left=rightLeft;
        right.right=rightRight;
        TreeNode rightRightRight = new TreeNode(19);
        rightRight.right=rightRightRight;
        return head;
    }
    public static TreeNode createBinaryTree(){
        TreeNode head = new TreeNode(7);
        TreeNode left = new TreeNode(1);
        TreeNode right = new TreeNode(13);
        head.left=left;
        head.right=right;
        TreeNode leftRight = new TreeNode(3);
        left.right=leftRight;
        TreeNode rightLeft = new TreeNode(11);
        TreeNode rightRight = new TreeNode(17);
        right.left=rightLeft;
        right.right=rightRight;
        return head;
    }

    public static TreeNode createSymTree(){
        TreeNode head = new TreeNode(7);
        TreeNode left = new TreeNode(13);
        TreeNode right = new TreeNode(13);
        head.left=left;
        head.right=right;
        TreeNode leftRight = new TreeNode(11);
        left.right=leftRight;
        TreeNode rightLeft = new TreeNode(11);
        TreeNode rightRight = new TreeNode(17);
        right.left=rightLeft;
        right.right=rightRight;
        TreeNode leftLeft = new TreeNode(17);
        left.left=leftLeft;
        return head;
    }

    public static TreeNode createFakeBinarySearchTree(){
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode leftleft = new TreeNode(3);
        TreeNode leftright = new TreeNode(4);
        TreeNode right = new TreeNode(5);
        TreeNode rightleft = new TreeNode(6);
        TreeNode rightright = new TreeNode(7);
        root.left = left;
        left.left = leftleft;
        left.right = leftright;
        right.right = rightright;
        right.left = rightleft;
        root.right =right;
        return root;
    }

    public static TreeNode diaBT(){
        TreeNode head = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        head.left=left;
        head.right=right;
        TreeNode leftleft = new TreeNode(4);
        TreeNode leftright = new TreeNode(5);
        left.left = leftleft;
        left.right = leftright;
        return head;
    }
    public static TreeNode creatSimpleBST(){
        TreeNode head = new TreeNode(7);
        TreeNode left = new TreeNode(3);
        TreeNode right = new TreeNode(15);
        TreeNode rightleft = new TreeNode(9);
        TreeNode rightright = new TreeNode(20);
        head.left=left;
        head.right=right;
        right.left = rightleft;
        right.right = rightright;
        return head;
    }
    public static List getNodes(){
        List list= new ArrayList<TreeNode>();
        TreeNode head = new TreeNode(7);
        TreeNode left = new TreeNode(1);
        TreeNode right = new TreeNode(13);
        head.left=left;
        head.right=right;
        TreeNode leftRight = new TreeNode(3);
        left.right=leftRight;
        TreeNode rightLeft = new TreeNode(11);
        TreeNode rightRight = new TreeNode(17);
        right.left=rightLeft;
        right.right=rightRight;
        TreeNode rightRightRight = new TreeNode(19);
        rightRight.right=rightRightRight;
        list.add(head);
        list.add(left);
        list.add(right);
        list.add(leftRight);
        list.add(rightLeft);
        list.add(rightRight);
        list.add(rightRightRight);
        return list;
    }

    public static void printTreeNodeList(java.util.List<TreeNode> list) {
        for(int i = 0; i< list.size();i++) {
            print(list.get(i));
        }

    }
}

