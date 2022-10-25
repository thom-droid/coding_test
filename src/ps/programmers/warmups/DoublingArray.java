package ps.programmers.warmups;

import java.util.Arrays;

public class DoublingArray {


    public static void main(String[] args) {
        System.out.println(Arrays.toString(doubleArray(new int[]{1, 2, 3, 4, 5})));

    }

    private static int[] doubleArray(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] *= 2;
        }

        return numbers;
    }
}
