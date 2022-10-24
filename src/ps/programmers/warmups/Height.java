package ps.programmers.warmups;

import java.util.Arrays;

public class Height {

    public static void main(String[] args) {

    }

    public static int count(int[] array, int height) {
        int count = 0;
        for (int i : array) {
            if (height < i) {
                count++;
            }
        }

        return count;
    }
}
