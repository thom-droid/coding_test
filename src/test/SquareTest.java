package test;

import org.junit.Test;
import ps.programmers.lvl01.Square;

import static org.junit.Assert.*;

public class SquareTest {

    Square square = new Square();

    @Test
    public void solution() {

        long expected = 144;
        long result = square.solution(121);

        long expected2 = -1;
        long result2 = square.solution(3);

        assertEquals(expected, result);
        assertEquals(expected2, result2);
    }
}