package test.programmers.lvl2;

import org.junit.Test;
import ps.programmers.lvl02.DominateLand12913;

import static org.junit.Assert.*;

public class DominateLand12913Test {

    DominateLand12913 dominateLand12913 = new DominateLand12913();

    @Test
    public void solution() {

        int expected = 16;
        int result = dominateLand12913.solution(new int[][]{{1, 2, 3, 5}, {5, 6, 7, 8}, {4, 3, 2, 1}});

        assertEquals(expected, result);
    }
}