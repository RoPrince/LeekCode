package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class SortedTwoSum {



    public static int[] twoSum(int[] numbers, int target) {
        Integer value;
        int[] answer = new int[2];
        HashMap<Integer,Integer> hashSum = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {


            if(hashSum.containsKey(target-numbers[i])){
                value = hashSum.get(target-numbers[i]);
                answer[0] = value+1;
                answer[1] =i+1;
                return answer;
            }
            else{
                hashSum.put(numbers[i],i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] input = {2, 7, 11, 15};
        int target = 9;
        int[] answer = twoSum(input, target);
        System.out.println(Arrays.toString(answer));

    }
}
