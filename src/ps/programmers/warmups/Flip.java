package ps.programmers.warmups;

import java.util.Arrays;

public class Flip {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(flip(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(flip(new int[]{1,0,1,1,1,3,5})));

    }

    public static int[] flip(int[] array) {

        int size = array.length;

        for (int i = 0; i < size / 2; i++) {
            int tmp = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i] = tmp;
        }

        return array;
    }
}
