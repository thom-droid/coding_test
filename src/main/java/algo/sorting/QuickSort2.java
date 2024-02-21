package algo.sorting;

public class QuickSort2 {

    public void quickSort(int[] array, int start, int end) {

        if(end <= start) return;

        int pivot = partition(array, start, end);
        quickSort(array, start, pivot - 1);
        quickSort(array, pivot + 1, end);

    }

    private int partition(int[] array, int start, int end) {

        int pivot = array[end];
        int i = start - 1;

        for (int j = start; j <= end - 1; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }

        // elements less than pivot are placed before i
        i++;
        int temp = array[i];
        array[i] = pivot;
        array[end] = temp;

        return i;
    }
}
