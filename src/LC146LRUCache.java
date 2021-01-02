class LRUNode {
    int key;
    int value;
    LRUNode next;
    LRUNode pre;

    public LRUNode(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

public class LC146LRUCache {
    private static  java.util.HashMap<Integer, LRUNode> map;
    private static int capacity;
    private static LRUNode head;
    private static LRUNode tail;


    public LC146LRUCache(int capacity) {
        map = new java.util.HashMap<>();
        this.capacity = capacity;
        head = null;
        tail = null;

    }

    public int get(int key) {
        LRUNode node = map.get(key);
        if (node == null) {
            return -1;
        }
        if (node != tail) {
            if (node == head) {
                head = head.next;
            } else {
                node.pre.next = node.next;
                node.next.pre = node.pre;
            }
            tail.next = node;
            node.pre = tail;
            node.next = null;
            tail = node;
        }
        return node.value;


    }

    public void put(int key, int value) {
        LRUNode node = map.get(key);
        if (node != null) {
            node.value = value;
            if (node != tail) {
                if (node == head) {
                    head = head.next;
                } else {
                    node.pre.next = node.next;
                    node.next.pre = node.pre;
                }
                tail.next = node;
                node.pre = tail;
                node.next = null;
                tail = node;
            }
        } else {
            LRUNode newNode = new LRUNode(key, value);
            if (capacity == 0) {
                LRUNode temp = head;
                head = head.next;
                map.remove(temp.key);
                capacity++;
            }
            if (head == null && tail == null) {
                head = newNode;
            } else {
                tail.next = newNode;
                newNode.pre = tail;
                newNode.next = null;
            }
            tail = newNode;
            map.put(key, newNode);
            capacity--;


        }
    }
    public static void main(String args[]) {
        LC146LRUCache cache = new LC146LRUCache(3);
        cache.put(1,10);
        cache.put(2,20);

        cache.put(3,30);
       // cache.put(4,40);
        System.out.println(cache.get(1));//10
        System.out.println(cache.get(2));//10
        System.out.println(cache.get(3));//40
       // System.out.println(cache.get(4));//40
        cache.put(5,50);
        cache.put(2,25);
        System.out.println(cache.get(1));//10
        System.out.println(cache.get(2));//-1
        System.out.println(cache.get(3));//30
       // System.out.println(cache.get(4));//40
        System.out.println(cache.get(5));//50
    }

}
