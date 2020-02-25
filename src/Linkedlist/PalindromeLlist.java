package Linkedlist;

import java.util.Stack;

public class PalindromeLlist {

    public static  boolean isPalindrome(Node head) {
        Stack<Integer> stackPal = new Stack<>();
        Node temp = head;
        while(temp!= null){
            stackPal.push(temp.val);
            temp= temp.next;
        }
        while(head!=null){
            if(head.val!= stackPal.peek()){
                return false;
            }
            head= head.next;
            stackPal.pop();
        }
        return true;
    }

    public static void main(String[] args) {

        Node list = new Node(1);
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(2);
        Node fourth = new Node(1);

        list.next = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = new Node(1);

        System.out.println(isPalindrome(list));


    }


}
