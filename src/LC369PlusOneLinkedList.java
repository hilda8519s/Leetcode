import java.util.*;

public class LC369PlusOneLinkedList {
    public static ListNode plusOne(ListNode head) {
        // sentinel head
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;

        // find the rightmost not-nine digit
        while (head != null) {
            if (head.value != 9)
                pre = head;
            head = head.next;
        }

        // increase this rightmost not-nine digit by 1
        pre.value++;
        pre = pre.next;

        // set all the following nines to zeros
        while (pre != null) {
            pre.value = 0;
            pre = pre.next;
        }

        return dummy.value != 0 ? dummy : dummy.next;
    }
    public static  void main(String args[]) {
        ListNode head = ListNode.createList8();
        ListNode.print(head);
        ListNode res = plusOne(head);
        ListNode.print(res);

    }
}
