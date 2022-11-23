package test.programmers.lvl1;

import org.junit.Test;
import ps.programmers.lvl01.GCDAndLCM;

import static org.junit.Assert.*;

public class GCDAndLCMTest {

    GCDAndLCM gcdAndLCM = new GCDAndLCM();

    @Test
    public void solution() {

        int[] expected = {3, 12};
        int[] result = gcdAndLCM.solution(3, 12);

        int[] expected2 = {1, 10};
        int[] result2 = gcdAndLCM.solution(2, 5);

        assertArrayEquals(expected, result);
        assertArrayEquals(expected2, result2);
    }
}