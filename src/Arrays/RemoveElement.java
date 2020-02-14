package Arrays;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {

        int j = 0;

        for (int i = 0; i < nums.length; i++) {

          if(nums[i]!=val){
              nums[j] = nums[i];
              j++;
          }

        }

        return j;
    }


    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        RemoveElement rm = new RemoveElement();
        rm.removeElement(nums, 3);


    }
}
