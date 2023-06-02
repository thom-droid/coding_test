package algo.sorting;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MergeSort2Test {

    MergeSort2 mergeSort2 = new MergeSort2();
    int[] array = new int[]{3, 5, 1, 2, 8, 7, 9, 4, 6};

    @Test
    public void mergeSort() {
        mergeSort2.mergeSort(array);
        System.out.println(Arrays.toString(array));
    }
}