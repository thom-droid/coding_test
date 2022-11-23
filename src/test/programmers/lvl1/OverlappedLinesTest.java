package test.programmers.lvl1;

import org.junit.Test;
import ps.programmers.warmups.OverlappedLines;

import static org.junit.Assert.*;

public class OverlappedLinesTest {

    OverlappedLines overlappedLines = new OverlappedLines();

    @Test
    public void solution() {

        int expected = 2;
        int result = overlappedLines.solution(new int[][]{{0, 1}, {2, 5}, {3, 9}});

        int expected2 = 0;
        int result2 = overlappedLines.solution(new int[][]{{-1, 1}, {1, 3}, {3, 9}});

        int expected3 = 8;
        int result3 = overlappedLines.solution(new int[][]{{0, 5}, {3, 9}, {1, 10}});

        assertEquals(expected, result);
        assertEquals(expected2, result2);
        assertEquals(expected3, result3);

    }

    @Test
    public void solution2() {

        int expected = 2;
        int result = overlappedLines.solution2(new int[][]{{0, 1}, {2, 5}, {3, 9}});

        int expected2 = 0;
        int result2 = overlappedLines.solution2(new int[][]{{-1, 1}, {1, 3}, {3, 9}});

        int expected3 = 8;
        int result3 = overlappedLines.solution2(new int[][]{{0, 5}, {3, 9}, {1, 10}});

        assertEquals(expected, result);
        assertEquals(expected2, result2);
        assertEquals(expected3, result3);

    }
}