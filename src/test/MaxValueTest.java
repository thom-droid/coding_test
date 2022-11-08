package test;

import org.junit.Test;
import ps.programmers.warmups.MaxValue;

import static org.junit.Assert.*;

public class MaxValueTest {

    MaxValue maxValue = new MaxValue();

    @Test
    public void maxValueTest() {
        int expected = 45;
        int[] arr = {1, 2, 4, 5, -9, -5, -3, 8};
        int result = maxValue.solution(arr);
        assertEquals(expected, result);

    }
}