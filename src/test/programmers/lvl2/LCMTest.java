package test.programmers.lvl2;

import org.junit.Test;
import ps.programmers.lvl02.LCM;

import static org.junit.Assert.*;

public class LCMTest {

    LCM lcm = new LCM();

    @Test
    public void solution() {

        int expected = 168;
        int result = lcm.solution(new int[]{2,6,8,14});

        int expected2 = 6;
        int result2 = lcm.solution(new int[]{1, 2, 3});

        int expected3 = 12;
        int result3 = lcm.solution(new int[]{2, 3, 4});

        assertEquals(expected, result);
        assertEquals(expected2, result2);
        assertEquals(expected3, result3);

    }
}