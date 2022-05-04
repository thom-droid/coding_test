package algo.sorting;

import java.util.Arrays;

public class HeapSort {

    private static final Integer[] DATA = {0,4,1,3,2,16,9,10,14,8,7};
    private static final int SIZE = DATA.length;
    private static void heapify(Integer[] data, int i) {

        Integer nodeToCompare = data[i];
        Integer biggestChildNode;
        int index = 0;

        // 번지 크기랑 대조하는 코드 하나 필요
        if (data[2 * i] == null) {
            return;
        }

        biggestChildNode = data[2 * i];

        if (data[2 * i + 1] != null) {

            if (data[2 * i] > data[2 * i + 1]) {
                index = 2 * i;
                biggestChildNode = data[2 * i];
            } else {
                index = 2 * i + 1;
                biggestChildNode = data[2 * i + 1];
            }

        }

        if (nodeToCompare >= biggestChildNode) {
            return;
        }

        data[index] = nodeToCompare;
        data[i] = biggestChildNode;

        heapify(data, index);

    }

    private static void maxHeapify() {
        int startNode = DATA[SIZE-1] / 2;
        for (int i = startNode; i >= 2; i--) {
            heapify(DATA, i);
        }
    }

    public static void main(String[] args) {
        maxHeapify();
        System.out.println(Arrays.toString(DATA));
    }
}
