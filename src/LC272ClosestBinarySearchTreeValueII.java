import java.util.*;

public class LC272ClosestBinarySearchTreeValueII {
    public static List<Integer> closestKValues(TreeNode root, double target, int k) {
        Deque<Integer> dq = new LinkedList<>();

        inorder(root, dq);
        while (dq.size() > k) {
            if (Math.abs(dq.peekFirst() - target) > Math.abs(dq.peekLast() - target))
                dq.pollFirst();
            else
                dq.pollLast();
        }

        return new ArrayList<Integer>(dq);
    }

    public static void inorder(TreeNode root, Deque<Integer> dq) {
        if (root == null)
            return;
        inorder(root.left, dq);
        dq.add(root.value);
        inorder(root.right, dq);
    }
    public static  void main(String  args[]) {
        TreeNode root = TreeNode.createBinarySearchTree();
        double target = 6;
        int k = 2;
        List<Integer> res = closestKValues(root,target,k);
        res.forEach(System.out::println);
    }

}
