package test.programmers.lvl2;

import org.junit.Test;
import ps.programmers.lvl02.NRadixGame17687;

import static org.junit.Assert.*;

public class NRadixGame17687Test {

    NRadixGame17687 nRadixGame17687 = new NRadixGame17687();

    @Test
    public void solution() {

        String expected = "0111";
        String result = nRadixGame17687.solution(2, 4, 2, 1);

        String expected2 = "02468ACE11111111";
        String result2 = nRadixGame17687.solution(16, 16, 2, 1);

        String expected3 = "13579BDF01234567";
        String result3 = nRadixGame17687.solution(16, 16, 2, 2);

        assertEquals(expected, result);
        assertEquals(expected2, result2);
        assertEquals(expected3, result3);
    }

}