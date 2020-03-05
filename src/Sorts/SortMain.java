package Sorts;

public class SortMain {

    public static void main(String[] args) {
         int[] sortArray = {4,5,7,3,2,9,8,1,10,6};

        //SelectionSort.performSelectionSort(sortArray);
       // BubbleSort.performBubbleSort(sortArray);

        InsertionSort.performInsertionSort(sortArray);
    }
}
