public class LC190ReverseBits {
    public static int reverseBits(int n) {
        int result = 0;                  // n : 1011   res: 1101
        if(n == 0)                       // res: 0-1
            return 0;                     //  n: 0101-
        for (int i = 0; i < 32; i++) {
            result <<= 1;
            if((n&1) == 1)
                result++;
             n >>= 1;
        }
        return result;
    }

    public static void main(String args[]) {
        int n = 7;
        int res = reverseBits(n);
        System.out.println(res);
    }

}
