package ps.programmers.warmups;

public class FindMaxValueAndIndex {

    public static void main(String[] args) {


    }

    private static int[] solution(int[] array) {
        int max = 0;
        int idx = 0;

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }



        for (int i = 0; i < array.length; i++) {
            if (max == array[i]) {
                idx = i;
            }
        }

        return new int[]{max, idx};
    }
}
