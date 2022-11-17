package test;

import org.junit.Test;
import ps.programmers.lvl01.NumberPair;

import static org.junit.Assert.*;

public class NumberPairTest {

    NumberPair numberPair = new NumberPair();

    @Test
    public void solution() {

        String expected = "-1";
        String result = numberPair.solution("100", "2345");

        String expected2 = "0";
        String result2 = numberPair.solution("100", "203045");

        String expected3 = "10";
        String result3 = numberPair.solution("100", "123450");

        String expected4 = "321";
        String result4 = numberPair.solution("12321", "42531");

        String expected5 = "552";
        String result5 = numberPair.solution("5525", "1255");

        assertEquals(expected, result);
        assertEquals(expected2, result2);
        assertEquals(expected3, result3);
        assertEquals(expected4, result4);
        assertEquals(expected5, result5);
    }
}