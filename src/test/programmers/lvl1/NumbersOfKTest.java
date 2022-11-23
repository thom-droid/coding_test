package test.programmers.lvl1;

import org.junit.Test;
import ps.programmers.warmups.NumbersOfK;

import static org.junit.Assert.*;

public class NumbersOfKTest {

    NumbersOfK numbersOfK = new NumbersOfK();

    @Test
    public void solution() {

        int expected = 6;
        int result = numbersOfK.solution(1, 13, 1);

        int expected2 = 5;
        int result2 = numbersOfK.solution(10, 50, 5);

        int expected3 = 0;
        int result3 = numbersOfK.solution(3, 10, 2);

        assertEquals(expected, result);
        assertEquals(expected2, result2);
        assertEquals(expected3, result3);
    }
}