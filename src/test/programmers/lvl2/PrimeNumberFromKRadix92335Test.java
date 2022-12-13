package test.programmers.lvl2;

import org.junit.Test;
import ps.programmers.lvl02.PrimeNumberFromKRadix92335;

import static org.junit.Assert.*;

public class PrimeNumberFromKRadix92335Test {

    PrimeNumberFromKRadix92335 primeNumberFromKRadix92335 = new PrimeNumberFromKRadix92335();

    @Test
    public void solution() {
//        int expected = 3;
        int result = primeNumberFromKRadix92335.solution(Integer.MAX_VALUE	, 3);

        int expected2 = 2;
        int result2 = primeNumberFromKRadix92335.solution(110011, 10);

        int expected3 = 0;
        int result3 = primeNumberFromKRadix92335.solution(1, 2);

        int expected4 = 0;
        int result4 = primeNumberFromKRadix92335.solution(2, 2);

//        assertEquals(expected, result);
        assertEquals(expected2, result2);
        assertEquals(expected3, result3);
        assertEquals(expected4, result4);
    }
}