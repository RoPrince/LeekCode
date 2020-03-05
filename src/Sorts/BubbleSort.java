package Sorts;

import java.util.Arrays;
import java.util.stream.Collectors;

public class BubbleSort {

    public static void performBubbleSort(int[] listToSort) {

        boolean isSwapped = false;

        for (int i = 0; i < listToSort.length; i++) {

            for (int j = listToSort.length - 1; j > i; j--) {
                if (listToSort[j] < listToSort[j-1]) {
                    swap(listToSort, j, j-1);
                    isSwapped = true;

                }
                printList(listToSort);
                if (!isSwapped) break;
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
