package test;

import org.junit.Test;
import ps.programmers.warmups.MathInString;

import static org.junit.Assert.*;

public class MathInStringTest {

    MathInString mathInString = new MathInString();

    @Test
    public void solution() {

        int expected = 10;
        int result = mathInString.solution("aAb1B2cC34oOp");

        int expected2 = 16;
        int result2 = mathInString.solution("1a2b3c4d123");

        assertEquals(expected, result);
        assertEquals(expected2, result2);
    }
}