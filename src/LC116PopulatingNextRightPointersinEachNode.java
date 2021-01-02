public class LC116PopulatingNextRightPointersinEachNode {
    /*public static void connect(TreeLinkNode root) {
        if (root == null)
            return;
        while (root != null) {
            TreeLinkNode newRoot = root;
            while (root != null) {
                if (root.left != null) {
                    root.left.next = root.right;
                }
                if (root.right != null && root.next != null) {
                    root.right.next = root.next.left;
                }
                root = root.next;
            }
        }

    }*/

    public static void connect(TreeLinkNode root) {

        TreeLinkNode n = root;

        while(n != null && n.left != null) {
            TreeLinkNode pre = null;

            for(TreeLinkNode p = n; p != null; p = p.next) {
                if(pre != null) {
                    pre.next = p.left;
                }
                p.left.next = p.right;
                pre = p.right;
            }
            n = n.left;
        }
    }


    public static void main(String args[]) {
        TreeLinkNode root = TreeLinkNode.createBinaryTree();
        connect(root);
        TreeLinkNode.print(root);
    }

}
