package algo.sorting;

import java.util.Arrays;

public class MergeSort {

    private static final int[] data = {1,5,4,6,2,3,7,9,8};
    public static void merge(int[] arr, int p, int q, int r) {
        int i = p;
        int j = q + 1;
        int k = p;
        int[] tmp = new int[arr.length];

        while (i <= q && j <= r) {

            if (arr[i] <= arr[j]) {
                tmp[k++] = arr[i++];
            } else {
                tmp[k++] = arr[j++];
            }
        }

        while (i <= q) { // j 쪽의 작은 값들이 다 선택되어서 없을 때. i 쪽 배열에만 값이 남았을 때.
            tmp[k++] = arr[i++];
        }

        while (j <= r) {
            tmp[k++] = arr[j++];
        }

        for(int l = p; l <= r; l++){ // 저장해놓은 값을 원래 배열에 돌려놓음
            arr[l] = tmp[l];
        }


    }

    public static void mergeSort(int[] arr, int p, int r){

        if(p < r){
            int q = (p + r) / 2;
            mergeSort(arr, p, q); // align the prior parts
            mergeSort(arr, q + 1, r); // then the latter parts
            merge(arr, p, q, r); // then merge into one
        }
    }

    public static void print(){
        mergeSort(data, 0, data.length - 1);
        System.out.println(Arrays.toString(data));
    }

    public static void main(String[] args) {
        print();
    }

}
