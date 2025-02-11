public class LC96UniqueBinarySearchTrees {
    public static int numTrees(int n) {
        if(n<=0)
            return 0;
        int[] res = new int[n+1];
        res[0] = 1;
        res[1] = 1;
        for(int i=2;i<=n; i++)
        {
            for(int j=0; j<i;j++)
            {
                res[i] += res[j]*res[i-j-1];
            }
        }
        return res[n];
    }
    public static void main(String args[]) {
        int n = 3;
        int res = numTrees(n);
        System.out.println(res);
    }
}
