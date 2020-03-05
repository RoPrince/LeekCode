package Stack;

import java.util.Stack;

public class DuplicateRemove {

    public static String removeDuplicates(String S) {

        StringBuilder sb  = new StringBuilder();
        Stack<String> uniqueStack = new Stack<>();


        for (int i = 0; i < S.length(); i++) {
            if (!uniqueStack.isEmpty() && (uniqueStack.peek().equals(String.valueOf(S.charAt(i))))) {
                uniqueStack.pop();
            } else {
                uniqueStack.push(String.valueOf(S.charAt(i)));
            }
        }
       while(!uniqueStack.isEmpty()){
           sb.append(uniqueStack.pop());

       }
        sb.reverse();
       return sb.toString();
    }

    public static void main(String[] args) {

        String input = "abbbabaaa";
        System.out.println(removeDuplicates(input));

    }
}
