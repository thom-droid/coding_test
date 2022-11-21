package test;

import org.junit.Test;
import ps.programmers.lvl01.FailureRate;

import static org.junit.Assert.*;

public class FailureRateTest {

    FailureRate failureRate = new FailureRate();

    @Test
    public void solution() {
        int[] expected = {3, 4, 2, 1, 5};
        int[] result = failureRate.solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3});

        int[] expected2 = {4, 1, 2, 3};
        int[] result2 = failureRate.solution(4, new int[]{4, 4, 4, 4, 4});

        int[] expected3 = {3, 2, 1, 4};
        int[] result3 = failureRate.solution(4, new int[]{1, 1, 1, 2, 3, 2, 3, 2, 1});


        assertArrayEquals(expected, result);
        assertArrayEquals(expected2, result2);
        assertArrayEquals(expected3, result3);

    }
}