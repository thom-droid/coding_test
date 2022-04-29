package algo.sorting;

import java.util.Arrays;

public class QuickSort {

    private static int[] ARRAY = {1,5,4,8,7,2,3,9,6};
    private static final int SIZE = ARRAY.length;

    private static void quickSort(int[] arr, int begin, int end) {

        if (begin < end) {
            int pivot = partition(arr, begin, end);
            quickSort(arr, begin, pivot - 1);
            quickSort(arr, pivot + 1, end);

        }
    }

    private static int partition(int[] arr, int begin, int end) {
        int pivot = arr[end];
        int i = begin - 1;

        for (int j = begin; j <= end - 1; j++) {

            if (arr[j] <= pivot) {
                i = exchangeValuesAndReturnIndex(arr, j, i);
            }
        }

        i = exchangeValuesAndReturnIndex(arr, end, i);

        return i;
    }

    private static int exchangeValuesAndReturnIndex(int[] arr, int end, int i) {
        int tmp = arr[end];
        arr[end] = arr[++i];
        arr[i] = tmp;
        return i;
    }

    public static void sortAndPrint() {
        quickSort(ARRAY, 0, SIZE - 1);
        System.out.println(Arrays.toString(ARRAY));
    }

    public static void main(String[] args) {
        sortAndPrint();
    }
}
