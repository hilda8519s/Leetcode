import java.util.*;

public class ListNode {
    public int value;
    public int getValue() {

        return value;
    }

    public void setValue(int value) {

        this.value = value;
    }

    public ListNode next;
    public ListNode(int x) {
        value = x;
        next = null;
    }

    public static ListNode createList1(){
        ListNode head = new ListNode(1);
        ListNode three = new ListNode(3);
        ListNode seven = new ListNode(5);
        ListNode eleven = new ListNode(7);
        ListNode thirteen = new ListNode(9);
        ListNode seventeen = new ListNode(10);
        ListNode nineteen = new ListNode(16);
        ListNode twentyThree = new ListNode(20);
        head.next=three;
        three.next=seven;
        seven.next=eleven;
        eleven.next=thirteen;
        thirteen.next=seventeen;
        seventeen.next=nineteen;
        nineteen.next=twentyThree;
        return head;
    }

    public static ListNode createList2(){
        ListNode head = new ListNode(11);
        ListNode three = new ListNode(13);
        ListNode seven = new ListNode(17);
        ListNode eleven = new ListNode(19);
        ListNode thirteen = new ListNode(23);
        ListNode seventeen = new ListNode(27);
        ListNode nineteen = new ListNode(29);
        ListNode twentyThree = new ListNode(30);
        head.next=three;
        three.next=seven;
        seven.next=eleven;
        eleven.next=thirteen;
        thirteen.next=seventeen;
        seventeen.next=nineteen;
        nineteen.next=twentyThree;
        return head;
    }
    public static ListNode createList3(){
        ListNode head = new ListNode(31);
        ListNode three = new ListNode(33);
        ListNode seven = new ListNode(37);
        ListNode eleven = new ListNode(41);
        ListNode thirteen = new ListNode(43);
        ListNode seventeen = new ListNode(47);
        ListNode nineteen = new ListNode(49);
        ListNode twentyThree = new ListNode(53);
        head.next=three;
        three.next=seven;
        seven.next=eleven;
        eleven.next=thirteen;
        thirteen.next=seventeen;
        seventeen.next=nineteen;
        nineteen.next=twentyThree;
        return head;
    }
    public static ListNode createList4(){
        ListNode head = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode seven = new ListNode(7);
        ListNode eight = new ListNode(8);
        head.next=three;
        three.next=seven;
        seven.next = eight;


        return head;
    }
    public static ListNode createList5(){
        ListNode head = new ListNode(1);
        ListNode three = new ListNode(4);
        //ListNode seven = new ListNode(6);

        head.next=three;
        //three.next=seven;


        return head;
    }

    public static ListNode createList6(){
        ListNode head = new ListNode(6);
        return head;
    }
    public static ListNode createList7(){
        ListNode head = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode seven = new ListNode(7);
        ListNode eight = new ListNode(8);
        head.next=two;
        two.next = three;
        three.next=seven;
        seven.next = eight;


        return head;
    }
    public static ListNode createList8() {
        ListNode head = new ListNode(1);
        ListNode three = new ListNode(3);
        ListNode nine = new ListNode(9);
        head.next=three;
        three.next=nine;

        return head;
    }
    public static ListNode createRemovableList(){
        ListNode head = new ListNode(6);
        ListNode one = new ListNode(-6);
        ListNode two = new ListNode(8);
        ListNode three = new ListNode(4);
        ListNode four = new ListNode(-12);
        ListNode five = new ListNode(9);
        ListNode six = new ListNode(8);
        ListNode seven = new ListNode(-8);
        head.next=one;
        one.next=two;
        two.next=three;
        three.next=four;
        four.next=five;
        five.next=five;
        five.next=seven;
        return head;
    }

    public static ListNode createPalindromeList(){
        ListNode head = new ListNode(1);
        ListNode three = new ListNode(3);
        ListNode seven = new ListNode(7);
        ListNode nineteen = new ListNode(3);
        ListNode twentyThree = new ListNode(1);
        head.next=three;
        three.next=seven;
        seven.next=nineteen;
        nineteen.next=twentyThree;
        return head;
    }

    public static void print(ListNode head){
        while(head!=null){
            System.out.print(head.value+"->");
            head=head.next;
        }
        System.out.println("null");
    }
}
