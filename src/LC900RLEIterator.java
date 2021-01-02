public class LC900RLEIterator {
    private  static int index;
    private  static int [] A;
    public LC900RLEIterator(int[] A) {
        this.A = A;
        index = 0;
    }

    private static int next(int n) {
        while(index < A.length && n > A[index]){
            n = n - A[index];
            index += 2;
        }

        if(index >= A.length){
            return -1;
        }

        A[index] = A[index] - n;
        return A[index + 1];
    }


    public static void main(String args[]) {
        int[] A = {3,8,0,9,2,5};
        LC900RLEIterator rle = new LC900RLEIterator(A);
        System.out.println(rle.next(2));
        System.out.println(rle.next(1));
        System.out.println(rle.next(1));
        System.out.println(rle.next(2));
    }
}
