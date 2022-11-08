package ps.programmers.warmups;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfSevenTest {

    NumberOfSeven numberOfSeven = new NumberOfSeven();

    @Test
    public void solution() {

        int expected = 4;
        int result = numberOfSeven.solution(new int[]{7, 77, 17});
        assertEquals(expected, result);

    }
}