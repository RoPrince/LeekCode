package Arrays;

import java.util.HashMap;

public class MaxSubArray {

    public int maxSubArray(int[] nums) {
        int sum =0;
        HashMap<Integer,Integer> sumMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            sum = sum+nums[i];
            sumMap.put(i,sum);
        }


        return 3;
    }

    public static void main(String[] args) {

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        MaxSubArray max = new MaxSubArray();
        System.out.println(max.maxSubArray(nums));

    }
}
