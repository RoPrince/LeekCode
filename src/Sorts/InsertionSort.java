package Sorts;

import java.util.Arrays;
import java.util.stream.Collectors;

public class InsertionSort {

    public static void performInsertionSort(int[] listToSort) {
        for (int i = 0; i < listToSort.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (listToSort[j] < listToSort[j-1]) {
                    swap(listToSort, j, j-1);
                } else {
                    break;
                }
                printList(listToSort);
            }
        }
    }


    public static void swap(int[] listToSort, int x, int y) {
        int temp = listToSort[x];
        listToSort[x] = listToSort[y];
        listToSort[y] = temp;
    }

    public static void printList(int[] listToSort) {
        System.out.println(Arrays.stream(listToSort).
                mapToObj(Integer::toString)
                .collect(Collectors.joining(",")));
    }

}
