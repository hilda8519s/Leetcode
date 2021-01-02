import java.util.*;

public class LC426ConvertBinarySearchTreetoSortedDoublyLinkedList {
    public static TNode treeToDoublyList(TNode root) {
        if (root == null) return null;
        TNode dummy = new TNode(0, null, null);
        TNode prev = dummy;
        prev = inorder(root, prev);
        prev.right = dummy.right;
        dummy.right.left = prev;
        return dummy.right;
    }

    private static TNode inorder(TNode node, TNode prev) {
        if (node == null)
            return prev;
        prev = inorder(node.left, prev);
        prev.right = node;
        node.left = prev;
        prev = inorder(node.right, node);
        return prev;
    }


    public static void main(String args[]) {
        TNode root =TNode.creatBST();
        TNode node = treeToDoublyList(root);
        TNode.print(node);
    }
}
