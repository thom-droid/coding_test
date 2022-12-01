package test.programmers.lvl2;

import org.junit.Test;
import ps.programmers.lvl02.Printer42587;

import static org.junit.Assert.*;

public class Printer42587Test {

    Printer42587 printer42587 = new Printer42587();

    @Test
    public void solution() {

        int expected = 1;
        int result = printer42587.solution(new int[]{2, 1, 3, 2}, 2);

        int expected2 = 5;
        int result2 = printer42587.solution(new int[]{1, 1, 9, 1, 1, 1}, 0);

        assertEquals(expected, result);
        assertEquals(expected2, result2);

    }
}