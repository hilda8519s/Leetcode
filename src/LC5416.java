import java.util.*;
public class LC5416 {
    public static int isPrefixOfWord(String sentence, String searchWord) {
        String[] str = sentence.split(" ");
        for(int i = 1; i<= str.length; i++) {
            if(str[i].contains(searchWord)){
                return i;
            }
        }
        return -1;
    }


    public static void main(String args[]) {
        
    }
}
