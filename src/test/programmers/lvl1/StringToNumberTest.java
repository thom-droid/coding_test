package test.programmers.lvl1;

import org.junit.Test;
import ps.programmers.warmups.StringToNumber;

import static org.junit.Assert.*;

public class StringToNumberTest {

    StringToNumber stringToNumber = new StringToNumber();

    @Test
    public void solution() {

        int expected = 7;
        int result = stringToNumber.solution("3 + 4");

        int expected2 = 15;
        int result2 = stringToNumber.solution("3 + 7 - 5 + 10");

        assertEquals(expected, result);
        assertEquals(expected2, result2);
    }
}