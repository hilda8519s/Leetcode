import java.util.*;
public class LC632SmallestRange {
    public static int[] smallestRange(List<List<Integer>> nums) {
        PriorityQueue<int[]> min=new PriorityQueue<>(1,new Comparator<int[]>(){
            public int compare(int[] n1,int[] n2){
                return nums.get(n1[0]).get(n1[1])-nums.get(n2[0]).get(n2[1]);
            }
        });

        PriorityQueue<int[]> max=new PriorityQueue<>(1,new Comparator<int[]>(){
            public int compare(int[] n1,int[] n2){

                return nums.get(n2[0]).get(n2[1])-nums.get(n1[0]).get(n1[1]);
            }
        });

        for(int i=0;i<nums.size();i++){
            int[] tmp=new int[]{i,0};
            min.offer(tmp);
            max.offer(tmp);
        }
        int[] res=new int[]{Integer.MIN_VALUE,Integer.MAX_VALUE};

        while(min.size()==nums.size()){
            int[] m1=max.peek();
            int[] m2=min.poll();
            if((long)nums.get(m1[0]).get(m1[1])-(long)nums.get(m2[0]).get(m2[1])<(long)res[1]-(long)res[0]){
                res[0]=nums.get(m2[0]).get(m2[1]);
                res[1]=nums.get(m1[0]).get(m1[1]);
            }

            if(m2[1]+1<nums.get(m2[0]).size()){
                int[] m3=new int[]{m2[0],m2[1]+1};
                min.offer(m3);
                max.offer(m3);
                max.remove(m2);
            }
        }

        return res;
    }

    public static void main(String args[]) {
        List<List<Integer>> input = new java.util.ArrayList<>();
        List<Integer> list1 = new java.util.ArrayList<>();
        List<Integer> list2 = new java.util.ArrayList<>();
        List<Integer> list3 = new java.util.ArrayList<>();
        int[] nums1 = new int[] {4,10,15,24,26};
        for(int n:nums1) {
            list1.add(n);
        }
        int[] nums2 = new int[]{0,9,12,20};
        for(int n :nums2) {
            list2.add(n);
        }
        int[] nums3 = new int[]{5,18,22,30};
        for(int n : nums3) {
            list3.add(n);
        }
        input.add(list1);
        input.add(list2);
        input.add(list3);
        int[] res = smallestRange(input);
        System.out.println(Arrays.toString(res));
    }
}
