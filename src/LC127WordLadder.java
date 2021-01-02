import  java.util.*;

public class LC127WordLadder {

    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> bset = new HashSet<>();
        bset.add(beginWord);
        Set<String> eset = new HashSet<>();
        eset.add(endWord);
        Set<String> wordset = new HashSet<String>(wordList);

        if(!wordset.contains(endWord))
            return 0;
        int count = 1;

        Set<String> visited = new HashSet<>();
        while(!bset.isEmpty() && !eset.isEmpty()) {
            if(bset.size() > eset.size()) {
                Set<String> set = bset;
                bset = eset;
                eset = set;
            }
            Set<String> temp = new HashSet<>();
            for(String word : bset){
                char[] chs = word.toCharArray();
                for(int i = 0; i < chs.length; i++) {
                    for(char c = 'a'; c <= 'z'; c++) {
                        char old = chs[i];
                        chs[i] = c;
                        String w = String.valueOf(chs);
                        if(eset.contains(w)){
                            return count+1;
                        }

                        if(!visited.contains(w) && wordset.contains(w)) {
                            temp.add(w);
                            visited.add(w);
                        }
                        chs[i] = old;
                    }
                }
            }
            bset = temp;
            count++;
        }
        return 0;


    }





    public static void main(String args[]) {
        String s = "hit";
        String t = "cog";
        List<String> list = new java.util.ArrayList<>();
        list.add("hot");
        list.add("dot");
        list.add("dog");
        list.add("lot");
        list.add("log");
        list.add("cog");
        int res = ladderLength(s,t,list);
        System.out.print(res);
    }
}
