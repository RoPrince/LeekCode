package ds.Queue;

import java.lang.reflect.Array;

public class Queue<T> {

    private static final int SPECIAL_INDEX = -1;
    private static final int SIZE = 30;
    private T[] elements;

    private int headIndex = SPECIAL_INDEX;
    private int tailIndex = SPECIAL_INDEX;

    public Queue(Class<T> clazz) {
        elements = (T[]) Array.newInstance(clazz, SIZE);
    }

    public boolean isEmpty() {
        return headIndex == SPECIAL_INDEX;
    }

    public boolean isFull() {
        int nextindex = (tailIndex + 1) % elements.length;
        return headIndex == nextindex;
    }

    public void enQueue(T data) throws Exception {
        if (isFull())
            throw new Exception("Queue is full");
        tailIndex = (tailIndex + 1) % elements.length;
        elements[tailIndex] = data;
        if (headIndex == SPECIAL_INDEX) {
            headIndex = tailIndex;
        }
    }

    public T deQueue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        T data = elements[headIndex];
        if (headIndex == tailIndex) {
            headIndex = SPECIAL_INDEX;
        }

        headIndex = (headIndex + 1) % elements.length;

        return data;
    }
}
