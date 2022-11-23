package test.programmers.lvl1;

import org.junit.Test;
import ps.programmers.lvl01.HamburgerMaker;

import static org.junit.Assert.*;

public class HamburgerMakerTest {

    HamburgerMaker hamburgerMaker = new HamburgerMaker();

    @Test
    public void solution() {

        int expected= 2;
        int result = hamburgerMaker.solution2(new int[]{2, 1, 1, 2, 3, 1, 2, 3, 1});

        int expected2 = 0;
        int result2 = hamburgerMaker.solution2(new int[]{1, 3, 2, 1, 2, 1, 3, 1, 2});

        assertEquals(expected, result);
        assertEquals(expected2, result2);
    }
}