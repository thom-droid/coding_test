package test;

import org.junit.Test;
import ps.programmers.lvl01.ColaBottle;

import static org.junit.Assert.*;

public class ColaBottleTest {

    ColaBottle colaBottle = new ColaBottle();

    @Test
    public void solution() {

        int expected = 19;
        int result = colaBottle.solution(2, 1, 20);

        int expected2 = 9;
        int result2 = colaBottle.solution(3, 1, 20);

        assertEquals(expected, result);
        assertEquals(expected2, result2);
    }
}