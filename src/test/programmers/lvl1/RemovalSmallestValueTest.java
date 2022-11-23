package test.programmers.lvl1;

import org.junit.Test;
import ps.programmers.lvl01.RemovalSmallestValue;

import static org.junit.Assert.*;

public class RemovalSmallestValueTest {

    RemovalSmallestValue removalSmallestValue = new RemovalSmallestValue();

    @Test
    public void solution() {

        int[] expected = {4, 3, 2};
        int[] result = removalSmallestValue.solution(new int[]{4, 3, 2, 1});

        int[] expected2 = {-1};
        int[] result2 = removalSmallestValue.solution(new int[]{10});

        int[] expected3 = {5, 4, 2, 3};
        int[] result3 = removalSmallestValue.solution(new int[]{5, 4, 1, 2, 3});

        assertArrayEquals(expected, result);
        assertArrayEquals(expected2, result2);
        assertArrayEquals(expected3, result3);
    }

}