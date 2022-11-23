package test.programmers.lvl1;

import org.junit.Test;
import ps.programmers.warmups.Rectangle;

import static org.junit.Assert.*;

public class RectangleTest {

    Rectangle rectangle = new Rectangle();

    @Test
    public void solution() {

        int expected = 1;
        int result = rectangle.solution(new int[][]{{1, 1}, {2, 1}, {2, 2}, {1, 2}});

        int expected2 = 4;
        int result2 = rectangle.solution(new int[][]{{-1, -1}, {1, 1}, {1, -1}, {-1, 1}});

        assertEquals(expected, result);
        assertEquals(expected2, result2);


    }
}