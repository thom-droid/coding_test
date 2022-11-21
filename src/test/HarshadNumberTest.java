package test;

import org.junit.Test;
import ps.programmers.lvl01.HarshadNumber;

import static org.junit.Assert.*;

public class HarshadNumberTest {

    HarshadNumber harshadNumber = new HarshadNumber();

    @Test
    public void solution() {

        boolean expected = true;
        boolean result = harshadNumber.solution(10);

        boolean expected2 = true;
        boolean result2 = harshadNumber.solution(12);

        boolean expected3 = false;
        boolean result3 = harshadNumber.solution(11);

        boolean expected4 = false;
        boolean result4 = harshadNumber.solution(13);


        assertEquals(expected, result);
        assertEquals(expected2, result2);
        assertEquals(expected3, result3);
        assertEquals(expected4, result4);

    }
}