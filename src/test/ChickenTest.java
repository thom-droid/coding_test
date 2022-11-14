package test;

import org.junit.Test;
import ps.programmers.warmups.Chicken;

import static org.junit.Assert.*;

public class ChickenTest {

    Chicken chicken = new Chicken();

    @Test
    public void solution() {

        int expected = 11;
        int result = chicken.solution(100);

        int expected2 = 120;
        int result2 = chicken.solution(1081);

        assertEquals(expected, result);
        assertEquals(expected2, result2);
    }
}