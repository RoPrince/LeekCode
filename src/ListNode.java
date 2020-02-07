

public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
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
        ListNode list = new ListNode(1);
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(2);
        ListNode fourth = new ListNode(3);


        list.next = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = new ListNode(4);

        Solution sol = new Solution();
        System.out.println(sol.deleteDuplicates(list));

    }
}


