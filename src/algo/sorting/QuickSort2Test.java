package algo.sorting;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSort2Test {

    QuickSort2 quickSort2 = new QuickSort2();
    int[] array = new int[]{3, 5, 1, 2, 8, 7, 9, 4, 6};

    @Test
    public void quickSort() {
        quickSort2.quickSort(array, 0, array.length - 1);
        assertArrayEquals(array, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
    }
}