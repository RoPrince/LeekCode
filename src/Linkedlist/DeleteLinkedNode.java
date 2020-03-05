package Linkedlist;

public class DeleteLinkedNode {

    public static void deleteNode(ListNode node) {

      node.val = node.next.val;
      node.next = node.next.next;


    }

    public static void main(String[] args) {

        ListNode one = new ListNode(4);
        ListNode two = new ListNode(5);
        ListNode three = new ListNode(1);
        ListNode four = new ListNode(9);
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = null;

        deleteNode(two);

    }
}
