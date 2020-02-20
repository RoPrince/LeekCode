package Stack;

import java.util.HashMap;
import java.util.Stack;

public class ParenthesisMatch {

    public static boolean isValid(String s) {

        HashMap<String, String> parenMap = new HashMap<>();
        parenMap.put("}", "{");
        parenMap.put(")", "(");
        parenMap.put("]", "[");
        Stack<String> stackString = new Stack<>();
        char[] inputStringInChar = s.toCharArray();

        for (int i = 0; i < inputStringInChar.length; i++) {
            if (parenMap.containsValue(String.valueOf(inputStringInChar[i]))) {
                stackString.push(String.valueOf(inputStringInChar[i]));
            }

            if(parenMap.containsKey(String.valueOf(inputStringInChar[i]))){
                if(stackString.isEmpty() || !stackString.pop().equals(parenMap.get(String.valueOf(inputStringInChar[i])))){
                    return false;
                }
            }
        }
        return stackString.isEmpty();
    }

    public static void main(String[] args) {

        String input = "]";
        System.out.println(isValid(input));

    }
}
