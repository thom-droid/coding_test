package algo.sorting;

import java.util.Arrays;

public class CountingSort {

    // k is the range of the size of each element in data
    private static int[] buildCountingArray(int[] data, int k) {

        int[] countingArray = new int[k + 1];

        for (int i = 0; i < data.length; i++) {
            countingArray[data[i]]++;
        }

        return countingArray;
    }

    private static void arrangeWithAccumulation(int[] countingArray) {

        for (int i = 1; i < countingArray.length; i++) {
            countingArray[i] += countingArray[i - 1];
        }
    }

    public static int[] countingSort(int[] data, int[] countingArray) {

        int[] sortedArray = new int[data.length];

        for (int i = data.length - 1; i >= 0; i--) {
            int index = countingArray[data[i]]-- -1;
            sortedArray[index] = data[i];
        }

        return sortedArray;
    }

    private static int[] data = {2,5,3,0,2,3,0,3};

    public static void main(String[] args) {
        int[] countingArray = buildCountingArray(data, 5);
        arrangeWithAccumulation(countingArray);
        int[] result = countingSort(data, countingArray);
        System.out.println(Arrays.toString(result));
    }
}
