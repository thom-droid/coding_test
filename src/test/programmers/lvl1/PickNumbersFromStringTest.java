package test.programmers.lvl1;

import org.junit.Test;
import ps.programmers.warmups.PickNumbersFromString;

import static org.junit.Assert.*;

public class PickNumbersFromStringTest {

    PickNumbersFromString pickNumbersFromString = new PickNumbersFromString();

    @Test
    public void solution() {
        int expected = 37;
        int result = pickNumbersFromString.solution("aAb1B2cC34oOp");

        int expected2 = 133;
        int result2 = pickNumbersFromString.solution("1a2b3c4d123Z");

        assertEquals(expected, result);
        assertEquals(expected2, result2);
    }
}