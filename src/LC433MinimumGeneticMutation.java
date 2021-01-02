import  java.util.*;
/*public class LC433MinimumGeneticMutation {

    public static int minMutation(String start, String end, String[] bank) {
       Set<String> dict = new HashSet<>();
       for(String s: bank) {
           dict.add(s);
       }
       if(!dict.contains(end))
           return -1;

       Set<String> bset = new HashSet<>();
       Set<String> eset = new HashSet<>();

       bset.add(start);
       eset.add(end);
       int step = 0, n = start.length();
       while(!bset.isEmpty() && !eset.isEmpty()) {
           if(bset.size() <= eset.size()) {
               Set<String> t = bset;
               bset = eset;
               eset = t;

           }
           Set<String> temp = new HashSet<>();

           char[] gene = new char[]{'A','C','G','T'};

           for(int i = 0; i< bank.length;i++) {
               for(int j = 0;j<n; j++) {
                   String dna = bank[i];
                   for()
               }
           }
       }


    }
    public static void main(String args[]) {
        String start = "AACCGGTT";
        String end ="AACCGGTA";
        String[] bank = {"AACCGGTA"};
        int res = minMutation(start,end,bank);
        System.out.print(res);
    }
}*/
