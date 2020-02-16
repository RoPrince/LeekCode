package Arrays;

public class InsertIndex {
    public static int searchInsert(int[] nums, int target) {
        int i;

        for (i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                return i;
            } else if (target < nums[i]) {
                return i;
            }
        }

        return i;

    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int index = searchInsert(nums, 0);
    }
}