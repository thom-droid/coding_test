package test;

import org.junit.Test;
import ps.programmers.warmups.WeirdSort;

import static org.junit.Assert.*;

public class WeirdSortTest {

    WeirdSort weirdSort = new WeirdSort();

    @Test
    public void solution() {

        int[] expected = {4, 5, 3, 6, 2, 1};
        int[] result = weirdSort.solution(new int[]{1, 2, 3, 4, 5, 6}, 4);

        int[] expected2 = {36, 40, 20, 47, 10, 6, 7000, 10000};
        int[] result2 = weirdSort.solution(new int[]{10000, 20, 36, 47, 40, 6, 10, 7000}, 30);

        assertArrayEquals(expected, result);
        assertArrayEquals(expected2, result2);
    }
}