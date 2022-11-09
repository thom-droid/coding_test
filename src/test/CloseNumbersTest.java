package test;

import org.junit.Test;
import ps.programmers.warmups.CloseNumbers;

import static org.junit.Assert.*;

public class CloseNumbersTest {

    CloseNumbers closeNumbers = new CloseNumbers();

    @Test
    public void solution() {

        int expected = 19;
        int result = closeNumbers.solution(new int[]{3, 10, 19, 21,28}, 20);

        int expected2 = 12;
        int result2 = closeNumbers.solution(new int[]{10, 11, 12}, 13);

        assertEquals(expected, result);
        assertEquals(expected2, result2);

    }
}