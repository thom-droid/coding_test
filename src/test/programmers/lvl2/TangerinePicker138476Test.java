package test.programmers.lvl2;

import org.junit.Test;
import ps.programmers.lvl02.TangerinePicker138476;

import static org.junit.Assert.*;

public class TangerinePicker138476Test {

    TangerinePicker138476 tangerinePicker138476 = new TangerinePicker138476();

    @Test
    public void solution() {

        int expected = 3;
        int result = tangerinePicker138476.solution(6, new int[]{1, 3, 2, 5, 4, 5, 2, 3});
        int resultA = tangerinePicker138476.solution2(6, new int[]{1, 3, 2, 5, 4, 5, 2, 3});

        int expected2 = 2;
        int result2 = tangerinePicker138476.solution(4, new int[]{1, 3, 2, 5, 4, 5, 2, 3});
        int result2A = tangerinePicker138476.solution2(4, new int[]{1, 3, 2, 5, 4, 5, 2, 3});

        int expected3 = 1;
        int result3 = tangerinePicker138476.solution(2, new int[]{1, 1, 1, 1, 2, 2, 2, 3});
        int result3A = tangerinePicker138476.solution2(2, new int[]{1, 1, 1, 1, 2, 2, 2, 3});

        assertEquals(expected, result);
        assertEquals(expected2, result2);
        assertEquals(expected3, result3);

        assertEquals(expected, resultA);
        assertEquals(expected2, result2A);
        assertEquals(expected3, result3A);

    }
}