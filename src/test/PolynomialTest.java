package test;

import org.junit.Test;
import ps.programmers.warmups.Polynomial;

import static org.junit.Assert.*;

public class PolynomialTest {

    Polynomial polynomial = new Polynomial();

    @Test
    public void solution() {

        String expected = "4x + 7";
        String result = polynomial.solution("3x + 7 + x");

        String expected2 = "3x";
        String result2 = polynomial.solution("x + x + x");

        String expected3 = "0";
        String result3 = polynomial.solution("0 + 0");

        String expected4 = "2";
        String result4 = polynomial.solution("1 + 1");

        String expected5 = "5x + 5";
        String result5 = polynomial.solution("2x + x + 1 + 2x + 4");

        String expected6 = "1";
        String result6 = polynomial.solution("0 + 1");

        String expected7 = "x";
        String result7 = polynomial.solution("x");

        assertEquals(expected, result);
        assertEquals(expected2, result2);
        assertEquals(expected3, result3);
        assertEquals(expected4, result4);
        assertEquals(expected5, result5);
        assertEquals(expected6, result6);
        assertEquals(expected7, result7);
    }
}