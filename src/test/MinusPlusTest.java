package test;

import org.junit.Test;
import ps.programmers.lvl01.MinusPlus;

import static org.junit.Assert.*;

public class MinusPlusTest {

    MinusPlus minusPlus = new MinusPlus();

    @Test
    public void solution() {

        int expected = 9;
        int result = minusPlus.solution(new int[]{4, 7, 12}, new boolean[]{true, false, true});

        int expected2 = 0;
        int result2 = minusPlus.solution(new int[]{1, 2, 3}, new boolean[]{false, false, true});

        assertEquals(expected, result);
        assertEquals(expected2, result2);
    }
}