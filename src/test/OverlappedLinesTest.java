package test;

import org.junit.Test;
import ps.programmers.warmups.OverlappedLines;

import static org.junit.Assert.*;

public class OverlappedLinesTest {

    OverlappedLines overlappedLines = new OverlappedLines();

    @Test
    public void solution2() {

        int expected = 2;
        int result = overlappedLines.solution2(new int[][]{{0, 1}, {2, 5}, {3, 9}});
    }
}