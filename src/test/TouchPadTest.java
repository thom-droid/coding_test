package test;

import org.junit.Test;
import ps.programmers.lvl01.TouchPad;

import static org.junit.Assert.*;

public class TouchPadTest {

    TouchPad touchPad = new TouchPad();

    @Test
    public void solution() {

        String expected = "LRLLLRLLRRL";
        String result = touchPad.solution(new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right");

        String expected2 = "LRLLRRLLLRR";
        String result2 = touchPad.solution(new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}, "left");

        String expected3 = "LLRLLRLLRL";
        String result3 = touchPad.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, "right");

        assertEquals(expected, result);
        assertEquals(expected2, result2);
        assertEquals(expected3, result3);
    }
}