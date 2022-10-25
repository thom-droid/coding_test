package ps.programmers.warmups;

import java.util.Arrays;

public class NotEven {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getOddArray(10)));
    }

    private static int[] getOddArray(int n) {

        int size = n / 2;

        if (n % 2 == 1) {
            size++;
        }

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = 2 * i + 1;
        }

        return array;
    }
}
