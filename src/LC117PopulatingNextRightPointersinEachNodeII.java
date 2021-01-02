import java.util.*;
public class LC117PopulatingNextRightPointersinEachNodeII {
    public static TreeLinkNode connect(TreeLinkNode root){
        if(root == null)
            return root;
        Queue<TreeLinkNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            int size = q.size();
            for(int i = 0; i < size; i++) {
                TreeLinkNode n = q.poll();
                if(i < size - 1) {
                    n.next = q.peek();
                }
                if(n.left != null)
                    q.add(n.left);
                if(n.right != null)
                    q.add(n.right);
            }
        }
        return  root;
    }

    public static void main(String args[]) {
        TreeLinkNode root = TreeLinkNode.createBinaryTree();
        TreeLinkNode node =  connect(root);
        TreeLinkNode.print(node);


    }
}
