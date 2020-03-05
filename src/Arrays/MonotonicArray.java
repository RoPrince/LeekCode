package Arrays;

public class MonotonicArray {

    public static boolean isMonotonic(int[] A) {
        int decreasingCount= 0;
        int increasingCount = 0;

        for (int i = 0; i < A.length-1; i++) {
            if(A[i]<A[i+1]){
                increasingCount++;
            }
            else if(A[i]>A[i+1]){
                decreasingCount++;
            }
        }

        return (increasingCount==0 || decreasingCount==0);
    }

    public static void main(String[] args) {

        int[] input = {1,2,4,5};

        System.out.println(isMonotonic(input));

    }
}
