package algo.sorting;

import java.util.Arrays;

public class HeapSort {

    private static final Integer[] DATA = {4,1,3,2,16,9,10,14,8,7};
    private static final int SIZE = DATA.length;

    private static void heapSort() {
        for (int i = SIZE - 1; i >= 0; i--) {
            int tmp = DATA[0];
            DATA[0] = DATA[i];
            DATA[i] = tmp;
            maxHeapify(DATA, i,0);
        }

    }
    private static void buildMaxHeap() {
        int startNode = SIZE / 2;
        for (int i = startNode; i >= 0; i--) {
            maxHeapify(DATA, SIZE, i);
        }
    }

    private static void maxHeapify(Integer[] data, int arrayLength, int parentIndex) {

        Integer parentNode = data[parentIndex];
        Integer biggestChildNode;
        int biggestChildIndex = 0;

        if (!hasLeftChildNode(parentIndex, arrayLength)) {
            return;
        }

        biggestChildNode = data[2 * parentIndex + 1];
        biggestChildIndex = 2 * parentIndex + 1;

        if (hasRightChildNode(parentIndex, arrayLength) &&
                data[2 * parentIndex + 1] < data[2 * parentIndex + 2]) {
            biggestChildIndex = 2 * parentIndex + 2;
            biggestChildNode = data[2 * parentIndex + 2];
        }

        if (parentNode >= biggestChildNode) {
            return;
        }

        data[biggestChildIndex] = parentNode;
        data[parentIndex] = biggestChildNode;

        maxHeapify(data, arrayLength, biggestChildIndex);

    }

    private static boolean hasLeftChildNode(int index, int arrayLength) {
        return index * 2 + 1 < arrayLength;
    }
    private static boolean hasRightChildNode(int index, int arrayLength) {
        return index * 2 + 2 < arrayLength;
    }

    public static void main(String[] args) {
        buildMaxHeap();
        heapSort();
        System.out.println(Arrays.toString(DATA));
    }
}
