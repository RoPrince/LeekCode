package Arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElem {

    public static int majorityElement(int[] nums) {

        int majority = nums.length / 2;
        int max = 0;
        HashMap<Integer, Integer> majorMap = new HashMap<>();

        for (int num :
                nums) {
            if (majorMap.containsKey(num)) {
                majorMap.put(num, majorMap.get(num) + 1);
            } else {
                majorMap.put(num, 1);
            }


        }

        for(Map.Entry<Integer,Integer> entry: majorMap.entrySet()){
            if(entry.getValue()>majority){
                max= entry.getKey();
                return max;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[] input = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(input));
    }
}
