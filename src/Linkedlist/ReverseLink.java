package Linkedlist;

public class ReverseLink {


    public ListNode reverseList(ListNode head) {
     ListNode prev= null;
     ListNode curr= head;
     while(curr!=null){
         ListNode temp = curr.next;
         curr.next  = prev;
         prev = curr;
         curr= temp;
     }
     return prev;
    }

    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = null;

        ReverseLink reverseLink = new ReverseLink();
        reverseLink.reverseList(one);

    }
}
