package Sorts;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SelectionSort {

    public static void print(int[] listToSort) {
        System.out.println(Arrays.stream(listToSort)
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(",")));
    }

    public static void swap(int[] listToSort, int x, int y) {
        int temp = listToSort[x];
        listToSort[x] = listToSort[y];
        listToSort[y] = temp;
    }

    public static void performSelectionSort(int[] listToSort){

        for (int i = 0; i < listToSort.length; i++) {
            for (int j = i+1; j < listToSort.length; j++) {
                if(listToSort[i]>listToSort[j]){
                    swap(listToSort,i,j);
                    print(listToSort);
                }
            }
        }

    }
}
