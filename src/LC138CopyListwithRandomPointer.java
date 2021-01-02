import  java.util.*;
class RandomListNode{
    RandomListNode head;
    RandomListNode next;
    RandomListNode random;
    int label;
    public  RandomListNode(int label) {

        this.label = label;
        }
        }
public class LC138CopyListwithRandomPointer {
    public RandomListNode copyRandomList(RandomListNode head) {
        if(head == null)
            return head;
        HashMap<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
        RandomListNode newHead = new RandomListNode(head.label);
        map.put(head,newHead);
        RandomListNode pre = newHead;
        RandomListNode node = head.next;
        while(node != null)
        {
            RandomListNode newNode = new RandomListNode(node.label);
            map.put(node,newNode);
            pre.next = newNode;
            pre = newNode;
            node = node.next;
        }
        node = head;
        RandomListNode copyNode = newHead;
        while(node != null)
        {
            copyNode.random = map.get(node.random);
            copyNode = copyNode.next;
            node = node.next;
        }
        return newHead;

    }
}
