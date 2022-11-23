package test.programmers.lvl1;

import org.junit.Test;
import ps.programmers.warmups.StringManipulation;

import static org.junit.Assert.*;

public class StringManipulationTest {

    StringManipulation stringManipulation = new StringManipulation();

    @Test
    public void solution() {

        int expected = 1;
        int result = stringManipulation.solution("hello", "ohell");

        int expected2 = -1;
        int result2 = stringManipulation.solution("apple", "elppa");

        assertEquals(expected, result);
        assertEquals(expected2, result2);
    }
}