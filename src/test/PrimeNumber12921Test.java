package test;

import org.junit.Test;
import ps.programmers.lvl01.PrimeNumber12921;

import static org.junit.Assert.*;

public class PrimeNumber12921Test {

    PrimeNumber12921 p = new PrimeNumber12921();

    @Test
    public void solution() {

        int expected = 4;
        int result = p.solution(10);

        int expected2 = 3;
        int result2 = p.solution(5);

        assertEquals(expected, result);
        assertEquals(expected2, result2);
    }
}