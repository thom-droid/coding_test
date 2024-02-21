package algo.sorting;

public class BubbleSort {

    public static void main(String[] args) {

    }

    public static void bubbleSort(int[] arr){

        for(int i = 0; i < arr.length; i++){
            for(int j = i +1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}
