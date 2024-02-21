package algo.sorting;

import java.util.Arrays;

public class RadixSortMain {

    public static void main(String[] args) {
        int[] arr = {23, 105, 5, 230, 506, 99, 28};
        int[] sorted = RadixSort.radixSort(arr, 9);
        System.out.println(Arrays.toString(sorted));
    }
}
