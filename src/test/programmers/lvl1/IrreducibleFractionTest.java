package test.programmers.lvl1;

import org.junit.Test;
import ps.programmers.warmups.IrreducibleFraction;

import static org.junit.Assert.*;

public class IrreducibleFractionTest {

    IrreducibleFraction irreducibleFraction = new IrreducibleFraction();

    @Test
    public void solution() {

        int expected = 1;
        int result = irreducibleFraction.solution(7, 20);

        int expected2 = 1;
        int result2 = irreducibleFraction.solution(11, 22);

        int expected3 = 2;
        int result3 = irreducibleFraction.solution(12, 21);

        assertEquals(expected, result);
        assertEquals(expected2, result2);
        assertEquals(expected3, result3);
    }
}