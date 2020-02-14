package Linkedlist;


public class NodeList {
    int val;
    NodeList next;

    NodeList(int x) {
        val = x;
    }
}


class MergeList {


    public NodeList mergeTwoLists(NodeList l1, NodeList l2) {
        NodeList head = new NodeList(0);
        NodeList trav = head;

        while (l1 != null && l2 != null) {

            if (l1.val == l2.val) {

                trav.next = l1;
                l1 = l1.next;
                trav.next.next = l2;
                l2 = l2.next;
                trav = trav.next.next;


            } else if (l1.val > l2.val) {

                trav.next = l2;
                l2 = l2.next;
                trav = trav.next;
            } else if (l1.val < l2.val) {

                trav.next = l1;
                l1 = l1.next;
                trav = trav.next;
            }
        }
        if (l1 != null) {
            trav.next = l1;

        }

        if (l2 != null) {
            trav.next = l2;

        }

        head = head.next;

        return head;
    }


    public static void main(String[] args) {
        NodeList list = new NodeList(1);
        NodeList first = new NodeList(2);
        NodeList second = new NodeList(4);
        NodeList list1 = new NodeList(1);
        NodeList third = new NodeList(3);
        NodeList fourth = new NodeList(4);

        list.next = first;
        first.next = second;
        list1.next = third;
        third.next = fourth;

        MergeList mergeList = new MergeList();
        mergeList.mergeTwoLists(list, list1);

    }


}


