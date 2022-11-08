package test;

import org.junit.Test;
import ps.programmers.warmups.ThreeSixNine;

import static org.junit.Assert.*;

public class ThreeSixNineTest {

    ThreeSixNine threeSixNine = new ThreeSixNine();

    @Test
    public void solutionTest() {
        int expected = 3;
        int result = threeSixNine.solution(123456789);
        assertEquals(expected, result);

    }

}