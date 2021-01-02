public class LC19RemoveNthNodeFromEndofList {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode(0);
        ListNode slow = start, fast = start;
        slow.next = head;

        //Move fast in front so that the gap between slow and fast becomes n
        for(int i=1; i<=n+1; i++)   {
            fast = fast.next;
        }
        //Move fast to the end, maintaining the gap
        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        //Skip the desired node
        slow.next = slow.next.next;
        return start.next;
    }
    public static ListNode removeNthNode(ListNode head, int n) {
      ListNode temp = head;
      for(int i = 0; i< n-1; i++)
          temp =temp.next;
      ListNode next = temp.next.next;
      temp.next = next;

     return head;



    }
    public static void main(String args[]) {
        ListNode head = ListNode.createList4();
        int n = 2;
        ListNode.print(head);
        ListNode res = removeNthFromEnd(head,n);
        ListNode.print(res);
        ListNode res1 = removeNthNode(head,n);
        ListNode.print(res1);
    }
}
