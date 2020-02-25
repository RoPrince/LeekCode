package Stack;

import java.util.Stack;

public class MinimalStack {

    Stack<Integer> minimalStack = new Stack<>();
    Stack<Integer> originalStack = new Stack<>();

    public MinimalStack() {
        int value;

    }


    public void push(int x) {
        int min = x;

        if (!(minimalStack.empty() || originalStack.empty()) && x > minimalStack.peek()) {
            min = minimalStack.peek();
        }
        minimalStack.push(min);
        originalStack.push(x);
    }

    public void pop() {
        originalStack.pop();
        minimalStack.pop();
    }

    public int top() {
        return originalStack.peek();
    }

    public int getMin() {
        return minimalStack.peek();
    }

    public static void main(String[] args) {

        int x = 6;
        MinimalStack minStack = new MinimalStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println( minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());


    }
}


