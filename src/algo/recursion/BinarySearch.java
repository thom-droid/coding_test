package algo.recursion;

public class BinarySearch {

    public static void main(String[] args) {
        String[] data = {"ab","abc","abcd","abcde","abcdef"};
        int result = binarySearch(data, 1, 4, "abc");
        System.out.println(result);
    }

    public static int binarySearch(String[] data, int begin, int end, String target){

        if(begin > end ){
            return -1;
        } else {

            int middle = (begin + end) / 2;
            int compResult = target.compareTo(data[middle]);

            if(compResult == 0){
                return middle;
            } else if(compResult<0){
                return binarySearch(data, begin, middle-1, target);
            } else {
                return binarySearch(data, middle+1, end, target);
            }
        }

    }
}
