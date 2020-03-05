package Linkedlist;

class MiddleList {

    public static ListNode middleNode(ListNode head) {

        ListNode temp = head;
        ListNode subList = head;
        int size = 0;


        while (temp != null) {
            size++;
            temp = temp.next;
        }

        int index = size / 2;

        while (index > 0) {
            subList = subList.next;
            index--;
        }

        return subList;
    }

    public static ListNode createList() {
        ListNode list = new ListNode(1);
        ListNode first = new ListNode(2);
        ListNode second = new ListNode(3);
        ListNode third = new ListNode(4);
        ListNode fourth = new ListNode(5);

        list.next = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = new ListNode(6);

        return list;
    }

    public static void main(String[] args) {

        ListNode input = createList();
        middleNode(input);

    }
}
