import java.util.*;

public class LC484FindPermutation {
    public static  int[] findPermutation(String s) {
        if(s==null)
            return new int[]{};
        int n= s.length()+1;

        int[] res = new int[n];
        for(int i=1; i<=n; i++){
            res[i-1]=i;
        }

        int lasti=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='I'){
                reverse(res, lasti, i);
                lasti=i+1;

            }
        }
        reverse(res, lasti, s.length());

        return res;

    }

    private static void reverse(int[] res, int s, int e) {


        while(s<e){
            swap(res, s, e);
            s++;
            e--;
        }
    }

    private static void swap(int[] nums, int a, int b){
        int temp=nums[a];
        nums[a] =nums[b];
        nums[b] =temp;
    }
  public static void main(String args[]){
        String s= "DII";
        int[] res = findPermutation(s);
        System.out.print(Arrays.toString(res));

  }

}
