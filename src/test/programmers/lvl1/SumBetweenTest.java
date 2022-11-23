package test.programmers.lvl1;

import org.junit.Test;
import ps.programmers.lvl01.SumBetween;

import static org.junit.Assert.*;

public class SumBetweenTest {

    SumBetween sumBetween = new SumBetween();

    @Test
    public void solution() {

        long expected = 12;
        long result = sumBetween.solution(3, 5);

        long expected2 = 3;
        long result2 = sumBetween.solution(3, 3);

        long expected3 = 12;
        long result3 = sumBetween.solution(5, 3);

        assertEquals(expected, result);
        assertEquals(expected2, result2);
        assertEquals(expected3, result3);

    }
}