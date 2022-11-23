package test.programmers.lvl1;

import org.junit.Test;
import ps.programmers.warmups.Triangle;

import static org.junit.Assert.*;

public class TriangleTest {

    Triangle triangle = new Triangle();

    @Test
    public void solution() {

        int expected = 1;
        int result = triangle.solution(new int[]{1, 2});

        int expected2 = 5;
        int result2 = triangle.solution(new int[]{3, 6});

        int expected3 = 13;
        int result3 = triangle.solution(new int[]{11, 7});

        assertEquals(expected, result);
        assertEquals(expected2, result2);
        assertEquals(expected3, result3);
    }
}