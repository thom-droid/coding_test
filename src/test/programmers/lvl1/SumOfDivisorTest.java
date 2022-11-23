package test.programmers.lvl1;

import org.junit.Test;
import ps.programmers.lvl01.SumOfDivisor;

import static org.junit.Assert.*;

public class SumOfDivisorTest {
    SumOfDivisor sumOfDivisor = new SumOfDivisor();

    @Test
    public void solution() {

        int expected = 43;
        int result = sumOfDivisor.solution(13, 17);

        int expected2 = 52;
        int result2 = sumOfDivisor.solution(24, 27);

        assertEquals(expected, result);
        assertEquals(expected2, result2);
    }
}