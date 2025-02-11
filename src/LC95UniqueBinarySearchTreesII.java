public class LC95UniqueBinarySearchTreesII {
    public static java.util.List<TreeNode> generateTrees(int n) {
        return genTrees(1,n);
    }

    public static  java.util.List<TreeNode> genTrees (int start, int end)
    {

        java.util.List<TreeNode> list = new java.util.ArrayList<TreeNode>();

        if(start>end)
        {
            list.add(null);
            return list;
        }

        if(start == end){
            list.add(new TreeNode(start));
            return list;
        }

        java.util.List<TreeNode> left,right;
        for(int i=start;i<=end;i++)
        {

            left = genTrees(start, i-1);
            right = genTrees(i+1,end);

            for(TreeNode lnode: left)
            {
                for(TreeNode rnode: right)
                {
                    TreeNode root = new TreeNode(i);
                    root.left = lnode;
                    root.right = rnode;
                    list.add(root);
                }
            }

        }

        return list;
    }
    public static void main(String args[]) {
        int n = 3;
        java.util.List<TreeNode> res = generateTrees(n);
        TreeNode.printTreeNodeList(res);
    }
}
