package algo.recursion;

public class SearchByRecursion {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        int target = 9;
//        int result = search(arr, 3, arr.length-1, target);
        int result = middleSearch(arr, 3, arr.length-1, target);
        System.out.println(result);
    }

    public static int search(int[] data, int begin, int end, int target){

        if(begin > end){
            return -1;
        } else if(target == data[begin]){
            return begin;
        } else {
            return search(data, begin+1, end, target);
        }
    }

    public static int middleSearch(int[] data, int begin, int end, int target){
        if(begin > end){
            return -1;
        } else {
            int middle = (begin + end) / 2;

            if(data[middle] == target){
                return middle;
            }

            int index =  middleSearch(data, begin, middle - 1, target);

            if(index != -1){
                return index;
            } else{
                int index2 = middleSearch(data, middle + 1, end, target);

                return index2;
            }


        }
    }
}
