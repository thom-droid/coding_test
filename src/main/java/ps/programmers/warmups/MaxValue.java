package ps.programmers.warmups;

import java.util.Arrays;

public class MaxValue {

    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int minus = numbers[0] * numbers[1];
        int plus = numbers[numbers.length - 2] * numbers[numbers.length - 1];

        return Math.max(minus, plus);
    }
}
