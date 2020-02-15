package Linkedlist;

import java.util.HashSet;
import java.util.Set;

class Node {
    int val;
    Node next;

    Node(int x) {
        val = x;
        next = null;
    }
}

public class CycleLinkedList {


    public boolean hasCycle(Node head) {

        Set<Node> hasSeen = new HashSet<>();
        while (head != null) {
            if (hasSeen.contains(head)) {
                return true;
            } else {
                hasSeen.add(head);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(3);
        head.next = new Node(2);
        head.next.next = new Node(0);
        head.next.next.next = new Node(-4);
        head.next.next.next.next = head.next;

        CycleLinkedList cycle = new CycleLinkedList();
        cycle.hasCycle(head);

    }

}
