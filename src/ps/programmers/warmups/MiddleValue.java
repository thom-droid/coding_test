package ps.programmers.warmups;

import java.util.Arrays;

public class MiddleValue {


    public static void main(String[] args) {
        System.out.println(getMiddle(new int[]{1, 6, 3, 2, 9}));
    }

    private static int getMiddle(int[] array) {
        Arrays.sort(array);
        int middle = array.length / 2;

        return array[middle];
    }
}
