package ds.linkedlist;

public class LinkedList<T extends Comparable<T>> implements Cloneable {

    private Node<T> head = null;
    private int count=0;

    public LinkedList() {

    }

    public void addNode(T newNode){
        Node<T> curr = head;
        if(head==null){
           head = new Node<>(newNode);
           count++;
        }else{
        while(curr!=null){
            curr= curr.getNext();
            count++;
        }
        curr.setNext(new Node<>(newNode));
        count++;}
    }

    public T popFirst(){
        if(head!=null){
            Node<T>  curr = head;
        head = head.getNext();
        count--;
        return curr.getData();
        }else
            return null;


    }

    public int getSize() {
        int size = 0;
        Node<T> curr = head;
        if (head == null) {
            return 0;
        } else {
            while (curr != null) {
                curr= curr.getNext();
                size++;
            }
        }

        return size;
    }
}
