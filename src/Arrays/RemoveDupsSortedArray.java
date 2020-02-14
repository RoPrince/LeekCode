package Arrays;

public class RemoveDupsSortedArray {

    private static int removeDuplicatesFromArray(int[] values) {
        int len = values.length;
        if (len == 0 || len == 1) {
            return len;
        }

        int[] temp = new int[len];
        int j = 0;

        for (int i = 0; i < len - 1; i++) {
            if (values[i] != values[i + 1]) {
                temp[j++] = values[i];
            }

        }
        temp[j++] = values[len - 1];

        for(int i=0;i<j;i++){
            values[i]  = temp[i];
        }
        return j;

    }

    public static int removeDuplicateElements(int arr[]){
        int len = arr.length;
        if (len==0 || len==1){
            return len;
        }
        int j = 0;//for next element
        for (int i=0; i <len-1; i++){
            if (arr[i] != arr[i+1]){
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[len-1];
        return j;
    }

    public static int removeDuplicates(int[] nums) {
        int length = nums.length;
        if(length==0 || length==1){
            return length;
        }

        int j=0;

        for(int i=1;i<length;i++){
            if(nums[i]!=nums[j]){
                nums[++j] = nums[i];
            }
        }

        return j+1;

    }



    public static void main(String[] args) {

        int[] values = {1,2,3,3,4,5};
      //  int length = removeDuplicatesFromArray(values);
      //  int size = removeDuplicateElements(values);
        int size = removeDuplicates(values);
        System.out.println(size);


    }


}

