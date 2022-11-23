package test.programmers.lvl1;

import org.junit.Test;
import ps.programmers.lvl01.TernaryNumeralSystem;

import static org.junit.Assert.*;

public class TernaryNumeralSystemTest {

    TernaryNumeralSystem ternaryNumeralSystem = new TernaryNumeralSystem();

    @Test
    public void solution() {

        int expected = 7;
        int result = ternaryNumeralSystem.solution(45);

        int expected2 = 229;
        int result2 = ternaryNumeralSystem.solution(125);

        assertEquals(expected, result);
        assertEquals(expected2, result2);
    }
}