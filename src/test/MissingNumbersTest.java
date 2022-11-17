package test;

import org.junit.Test;
import ps.programmers.lvl01.MissingNumbers;

import static org.junit.Assert.*;

public class MissingNumbersTest {

    MissingNumbers missingNumbers = new MissingNumbers();

    @Test
    public void solution() {

        int expected = 14;
        int result = missingNumbers.solution(new int[]{1, 2, 3, 4, 6, 7, 8, 0});

        int expected2 = 6;
        int result2 = missingNumbers.solution(new int[]{5, 8, 4, 0, 6, 7, 9});

        assertEquals(expected, result);
        assertEquals(expected2, result2);
    }
}