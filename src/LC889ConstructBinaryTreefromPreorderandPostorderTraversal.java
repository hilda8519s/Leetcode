import java.util.*;

public class LC889ConstructBinaryTreefromPreorderandPostorderTraversal {
    public static TreeNode constructFromPrePost(int[] pre, int[] post) {
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.offer(new TreeNode(pre[0]));
        for (int i = 1, j = 0; i < pre.length; ++i) {
            TreeNode node = new TreeNode(pre[i]);
            while (deque.getLast().value == post[j]) {
                deque.pollLast(); j++;
            }
            if (deque.getLast().left == null)
                deque.getLast().left = node;
            else deque.getLast().right = node;
            deque.offer(node);
        }
        return deque.getFirst();
    }
    public static void main(String args[]) {
        int[] pre = {1,2,4,5,3,6,7};
        int[] post = {4,5,2,6,7,3,1};
        TreeNode root = constructFromPrePost(pre,post);
        TreeNode.print(root);
    }

}
