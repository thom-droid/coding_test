package test.programmers.lvl1;

import org.junit.Test;
import ps.programmers.lvl01.SmallestRectangle;

import static org.junit.Assert.*;

public class SmallestRectangleTest {

    SmallestRectangle smallestRectangle = new SmallestRectangle();

    @Test
    public void solution() {

        int expected = 4000;
        int result = smallestRectangle.solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}});

        int expected2 = 120;
        int result2 = smallestRectangle.solution(new int[][]{{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}});

        int expected3 = 133;
        int result3 = smallestRectangle.solution(new int[][]{{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}});

        assertEquals(expected, result);
        assertEquals(expected2, result2);
        assertEquals(expected3, result3);
    }
}