package Arrays;

public class ParitySortII {

    public int[] sortArrayByParityII(int[] A) {

        int j=1;

        for (int i = 0; i < A.length; i=i+2) {
            if(A[i]%2!=0){
                while(j<A.length && A[j]%2!=0){
                    j=j+2;
                }
                swap(A,i,j);
            }

        }


        return A;

    }

    private void swap(int[] A,int i, int i1) {
        int k=A[i];
        A[i]= A[i1];
        A[i1] = k;
    }

    public static void main(String[] args) {

        int[] nums = {4,2,5,7};
        ParitySortII parity = new ParitySortII();
        parity.sortArrayByParityII(nums);
    }
}
