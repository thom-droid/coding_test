package test.programmers.lvl1;

import org.junit.Test;
import ps.programmers.warmups.SafeZone;

import static org.junit.Assert.*;

public class SafeZoneTest {

    SafeZone safeZone = new SafeZone();

    @Test
    public void solution() {

        int expected = 16;
        int result = safeZone.solution(new int[][]{{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}});

        int expected2 = 13;
        int result2 = safeZone.solution(new int[][]{{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 1, 0}, {0, 0, 0, 0, 0}});

        int expected3 = 0;
        int result3 = safeZone.solution(new int[][]{{1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}});

        assertEquals(expected, result);
        assertEquals(expected2, result2);
        assertEquals(expected3, result3);
    }
}