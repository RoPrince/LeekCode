public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = 0;
        int j = 0;
        int k = 0;
        int[] tmp = new int[m+n];

        while (i < m && j < n) {

            if (nums1[i] < nums2[j]) {
                tmp[k++] = nums1[i];
                i++;

            } else if (nums1[i] > nums2[j]) {
                tmp[k++] = nums2[j];
                j++;
            } else {
                tmp[k++] = nums1[i];
                tmp[k++] = nums2[j];
                i++;
                j++;
            }

        }

        while (i < m) {
            tmp[k++] = nums1[i];
            i++;
        }

        while (j < n) {
            tmp[k++] = nums2[j];
            j++;
        }


        for (int l = 0; l < tmp.length; l++) {
            nums1[l]  =tmp[l];
        }



    }

    public static void main(String[] args) {
        int[] val1 = {-1,0,0,3,3,3,0,0,0};
        int[] val2 = {1,2,2};





        merge(val1, 6, val2, 3);
        System.out.println("fg");
    }
}
