package test;

import org.junit.Test;
import ps.programmers.warmups.SumOfConsecutiveNumbers;

import static org.junit.Assert.*;

public class SumOfConsecutiveNumbersTest {

    SumOfConsecutiveNumbers sumOfConsecutiveNumbers = new SumOfConsecutiveNumbers();

    @Test
    public void solution() {

        int[] expected = {3, 4, 5};
        int[] result = sumOfConsecutiveNumbers.solution(3, 12);

        int[] expected2 = {1, 2, 3, 4, 5};
        int[] result2 = sumOfConsecutiveNumbers.solution(5, 15);

        int[] expected3 = {2, 3, 4, 5};
        int[] result3 = sumOfConsecutiveNumbers.solution(4, 14);

        int[] expected4 = {-1, 0, 1, 2, 3};
        int[] result4 = sumOfConsecutiveNumbers.solution(5, 5);

        assertArrayEquals(expected, result);
        assertArrayEquals(expected2, result2);
        assertArrayEquals(expected3, result3);
        assertArrayEquals(expected4, result4);
    }
}