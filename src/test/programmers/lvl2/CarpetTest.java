package test.programmers.lvl2;

import org.junit.Test;
import ps.programmers.lvl02.Carpet;

import static org.junit.Assert.*;

public class CarpetTest {

    Carpet carpet = new Carpet();

    @Test
    public void solution() {

        int[] expected = {4, 3};
        int[] result = carpet.solution(10, 2);

        int[] expected2 = {3, 3};
        int[] result2 = carpet.solution(8, 1);

        int[] expected3 = {8, 6};
        int[] result3 = carpet.solution(24, 24);

        assertArrayEquals(expected, result);
        assertArrayEquals(expected2, result2);
        assertArrayEquals(expected3, result3);
    }
}