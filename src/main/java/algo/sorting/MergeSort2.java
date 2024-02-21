package algo.sorting;

public class MergeSort2 {

    public void mergeSort(int[] array) {

        int length = array.length;

        if(length == 1) return; // base case

        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int leftIndex = 0;
        int rightIndex = 0;

        // fill sub-arrays up
        for (int i = 0; i < length; i++) {
            if (i < middle) {
                leftArray[leftIndex] = array[i];
                leftIndex++;
            } else {
                rightArray[rightIndex] = array[i];
                rightIndex++;
            }
        }

        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);

    }

    private void merge(int[] leftArray, int[] rightArray, int[] array) {

        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int i = 0, l = 0, r = 0;

        while (l < leftSize && r < rightSize) {
            if (leftArray[l] < rightArray[r]) {
                array[i++] = leftArray[l++];
            } else {
                array[i++] = rightArray[r++];
            }
        }

        while (l < leftSize) {
            array[i++] = leftArray[l++];
        }

        while (r < rightSize) {
            array[i++] = rightArray[r++];
        }
    }

}
