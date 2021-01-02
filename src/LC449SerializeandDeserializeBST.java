public class LC449SerializeandDeserializeBST {
    public static String serialize(TreeNode root) { // preorder
        StringBuilder sb = new StringBuilder();
        serializedfs(root, sb);
        return sb.toString();
    }

    private static void serializedfs(TreeNode root, StringBuilder sb){
        if(root == null)
            return; // no "null "
        sb.append(root.value).append(" ");
        serializedfs(root.left, sb);
        serializedfs(root.right, sb);
    }

    // Decodes your encoded data to tree.
    public static TreeNode deserialize(String data) {
        if(data.length() == 0)
            return null;
        String[] list = data.split(" ");
        TreeNode dummy = new TreeNode(0);
        deserializedfs(list, 0, dummy, true, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return dummy.left;
    }

    private static int deserializedfs(String[] list, int pos, TreeNode par, boolean isleft,
                               int lower, int upper){
        if(pos >= list.length) return pos;

        int val = Integer.valueOf(list[pos]);
        if(val < lower || val > upper)
            return pos-1; // have not used this pos, so minus one
        TreeNode cur = new TreeNode(val);

        if(isleft)
            par.left = cur;
        else
            par.right = cur;

        pos = deserializedfs(list, ++pos, cur, true, lower, val);
        pos = deserializedfs(list, ++pos, cur, false, val, upper);
        return pos;
    }
    public static void main(String args[]) {
        TreeNode root = TreeNode.createBinarySearchTree();
        String res = serialize(root);
        System.out.println(res);
        TreeNode node = deserialize(res);
        TreeNode.print(node);
    }
}
