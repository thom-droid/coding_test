package test;

import org.junit.Test;
import ps.programmers.lvl01.AppleBox;

import static org.junit.Assert.*;

public class AppleBoxTest {

    AppleBox appleBox = new AppleBox();

    @Test
    public void solution() {

        int expected = 8;
        int result = appleBox.solution(3, 4, new int[]{1, 2, 3, 1, 2, 3, 1});

        int expected2 = 33;
        int result2 = appleBox.solution(4, 3, new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2});

        assertEquals(expected, result);
        assertEquals(expected2, result2);
    }
}