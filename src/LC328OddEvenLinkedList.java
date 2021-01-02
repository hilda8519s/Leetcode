public class LC328OddEvenLinkedList {
    public static ListNode oddEvenList(ListNode head){
        ListNode odd = head;
        ListNode even = head.next;
        ListNode temp = even;

        while(even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = temp;
        return head;
    }

    public static void main(String args[]) {
        ListNode head = ListNode.createList7();
        ListNode.print(head);
        ListNode res = oddEvenList(head);
        ListNode.print(res);
    }
}
