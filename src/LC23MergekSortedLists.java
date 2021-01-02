import java.util.*;
public class LC23MergekSortedLists {
    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists==null||lists.length==0)
            return null;

        PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>((n1, n2) -> n1.value - n2.value);

        ListNode dummy = new ListNode(0);
        ListNode tail=dummy;

        for (ListNode node:lists) {
            if (node != null)
                queue.add(node);
            ListNode.print(node);
        }

            while (!queue.isEmpty()) {
                tail.next = queue.poll();

                tail = tail.next;

                if (tail.next != null)
                    queue.add(tail.next);
            }

        return dummy.next;
    }
    public  static void main(String args[]) {
        ListNode[] lists = new ListNode[3];
        lists[0] = ListNode.createList4();
        lists[1] = ListNode.createList5();
        lists[2] = ListNode.createList6();
        for(ListNode l: lists) {
            ListNode.print(l);
        }
        ListNode res = mergeKLists(lists);
        ListNode.print(res);
    }
}
