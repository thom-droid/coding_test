package test;

import org.junit.Test;
import ps.programmers.lvl01.Collatz;

import static org.junit.Assert.*;

public class CollatzTest {

    Collatz collatz = new Collatz();

    @Test
    public void solution() {

        int expected= 8;
        int result = collatz.solution(6);

        int expected2 = 4;
        int result2 = collatz.solution(16);

        int expected3 = -1;
        int result3 = collatz.solution(626331);

        assertEquals(expected, result);
        assertEquals(expected2, result2);
        assertEquals(expected3, result3);
    }
}