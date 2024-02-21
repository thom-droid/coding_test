package algo.sorting;

import java.util.Arrays;

public class InsertionSort {
    private static int[] arr = {1,5,4,2};
    public static void main(String[] args) {
        sortByInsertion(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void sortByInsertion(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }
}
