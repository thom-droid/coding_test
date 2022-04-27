package algo.sorting;

public class MergeSort {

    public static void main(String[] args) {

    }

    public static void mergeSort(int[] arr, int start, int end){

        if(start < end){
            int middle = (start + end) / 2;
            mergeSort(arr, start, middle); // 전반부
            mergeSort(arr, middle + 1, end); // 후반부

        }
    }

    public static void merge(int[] arr, int start, int middle, int end) {
        int i = start;
        int j = middle + 1;
        int k = start;
        int tmp[] = new int[arr.length];

        while (i <= middle && j <= end) {

            if (arr[i] <= arr[j]) {
                tmp[k++] = arr[i++];
            } else {
                tmp[k++] = arr[j++];
            }
        }

        while (i <= middle) { // j 쪽의 작은 값들이 다 선택되어서 없을 때. i 쪽 배열에만 값이 남았을 때.
            tmp[k++] = arr[i++];
        }

        while (j <= end) {
            tmp[k++] = arr[j++];
        }

        for(int r = 0; r < tmp.length; r++){ // 저장해놓은 값을 원래 배열에 돌려놓음
            arr[r] = tmp[r];
        }


    }

}
