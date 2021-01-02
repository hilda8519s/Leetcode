import java.util.*;
public class LC382LinkedListRandoNode {

    static ListNode head;
   static  Random random;

    public LC382LinkedListRandoNode(ListNode head){
        this.head  = head;
        random = new java.util.Random();
    }

    private static int getRandom() {
        ListNode node = head;
        int val = node.value;
        for(int i = 1; node.next != null; i++) {
            node = node.next;
            if(random.nextInt(i+1) == i)
                val = node.value;

        }
      return val;
    }

    public static void main(String args[]) {
        ListNode head = ListNode.createList8();
        ListNode.print(head);
        LC382LinkedListRandoNode solution = new LC382LinkedListRandoNode(head);
        int res = solution.getRandom();
        System.out.println(res);
    }

}
