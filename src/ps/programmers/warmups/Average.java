package ps.programmers.warmups;

import java.util.Arrays;

public class Average {

    public static double average(int[] numbers) {

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        return ((double) sum / numbers.length);
    }
}
