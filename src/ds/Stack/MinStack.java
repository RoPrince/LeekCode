package ds.Stack;

public class MinStack {

    private Stack<Integer> originStack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();

    public void push(int num) {
        int min = num;
        if (!minStack.isEmpty()) {
            if (min > minStack.peek()) {
                min = minStack.peek();
            }
        }
        originStack.push(num);
        minStack.push(min);

    }

    public void pop(){
        minStack.pop();
        originStack.pop();
    }

    public int minPeek(){
        return minStack.peek();
    }

}
