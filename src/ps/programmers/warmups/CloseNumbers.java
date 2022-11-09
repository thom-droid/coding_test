package ps.programmers.warmups;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CloseNumbers {

    public int solution(int[] array, int n) {
        int[] subtract = new int[array.length];
        Arrays.sort(array);

        for (int i = 0; i < subtract.length; i++) {
            subtract[i] = Math.abs(n - array[i]);
        }

        int idx = 0;
        int min = 99;

        for (int i = 0; i < subtract.length; i++) {
            if (min > subtract[i] ) {
                min = subtract[i];
                idx = i;
            }
        }

        return array[idx];
    }
}
