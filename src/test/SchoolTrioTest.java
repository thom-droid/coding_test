package test;

import org.junit.Test;
import ps.programmers.lvl01.SchoolTrio;

import static org.junit.Assert.*;

public class SchoolTrioTest {

    SchoolTrio schoolTrio = new SchoolTrio();

    @Test
    public void solution() {

        int expected = 2;
        int result = schoolTrio.solution(new int[]{-2, 3, 0, 2, -5});

        int expected2 = 5;
        int result2 = schoolTrio.solution(new int[]{-3, -2, -1, 0, 1, 2, 3});

        int expected3 = 0;
        int result3 = schoolTrio.solution(new int[]{-1, 1, -1, 1});

        assertEquals(expected, result);
        assertEquals(expected2, result2);
        assertEquals(expected3, result3);
    }
}