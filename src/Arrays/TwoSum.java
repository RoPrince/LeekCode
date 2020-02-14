package Arrays;

import java.util.HashMap;
import java.util.Map;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int answer[] = new int[2];
        Map<Integer, Integer> hashValue = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (hashValue.containsKey(target - nums[i])) {
                answer[0] = hashValue.get(target - nums[i]);
                answer[1] = i;
                break;

            } else {
                hashValue.put(nums[i], i);
            }


        }

        return answer;


    }

    public static void main(String[] args) {
        TwoSum sol = new TwoSum();
        int[] nums = new int[5];
        nums[0] = 2;
        nums[1] = 7;
        nums[2] = 11;
        nums[3] = 5;
        int target = 9;
        sol.twoSum(nums, target);

    }

}


