import  java.util.*;
public class LC849MaximizeDistancetoClosestPerson {
    public static  int maxDistToClosest(int[] seats) {//TIME O(N) SPACE O(N), TWO POINTERS .从首尾扫描。注意 seats[0]=seats[n-1]=0的 corner cases
        int n = seats.length;
        int max = 0;
        int i = 0;
        while(i < n){
            while(i < n && seats[i] == 1){
                i++;
            }
            int j = i;//start
            while(i < n && seats[i] == 0){
                i++;
            }
            if(j == 0 || i == n){
                max = Math.max(max, i - j);
            }else{
                max = Math.max(max, (i - j + 1) / 2) ;
            }
        }
        return max;
    }

    public static void main(String args[]) {
        int[] seats = {1,0,0,0,1,0,1};
        int res = maxDistToClosest(seats);
        System.out.print(res);
    }
}
