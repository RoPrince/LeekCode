package ds.Stack;

public class Stack<T> {

    private static int MAX_SIZE = 40;

    private int size = 0;
    private Element<T> top;

    public void push(T data) {
        if (size == MAX_SIZE) {
            throw new StackOverflowError("Stack is full");
        }
        Element elem = new Element(data, top);
        top = elem;
        size++;

    }

    public T pop() {

        if (size <= 0) {
            throw new StackOverflowError("Stack is empty");
        }
        T elem = top.getData();
        top = top.getNext();
        size--;

        return elem;
    }

    public T peek() {

        if (size <= 0) {
            throw new StackOverflowError("Stack is empty");
        }
        return top.getData();

    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == MAX_SIZE;
    }

    public int size() {
        return size;
    }
}
