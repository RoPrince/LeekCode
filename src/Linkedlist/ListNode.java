package Linkedlist;

public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {
    public Node deleteDuplicates(Node head) {
        Node curr = head;
        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }

        return head;

    }


    public static void main(String[] args) {
        Node list = createList();

        Solution sol = new Solution();
        System.out.println(sol.deleteDuplicates(list));

    }

    public static Node createList() {
        Node list = new Node(1);
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(2);
        Node fourth = new Node(3);

        list.next = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = new Node(4);
        return list;
    }
}


