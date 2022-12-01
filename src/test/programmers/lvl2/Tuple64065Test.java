package test.programmers.lvl2;

import org.junit.Test;
import ps.programmers.lvl02.Tuple64065;

import static org.junit.Assert.*;

public class Tuple64065Test {

    Tuple64065 tuple64065 = new Tuple64065();

    @Test
    public void solution() {

        int[] expected = {2, 1, 3, 4};
        int[] result = tuple64065.solution("{{2},{2,1},{2,1,3},{2,1,3,4}}");

        int[] expected2 = {2, 1, 3, 4};
        int[] result2 = tuple64065.solution("{{1,2,3},{2,1},{1,2,4,3},{2}}");

        int[] expected3 = {111, 20};
        int[] result3 = tuple64065.solution("{{20,111},{111}}");

        int[] expected4 = {123};
        int[] result4 = tuple64065.solution("{{123}}");

        int[] expected5 = {3, 2, 4, 1};
        int[] result5 = tuple64065.solution("{{4,2,3},{3},{2,3,4,1},{2,3}}");


        assertArrayEquals(expected, result);
        assertArrayEquals(expected2, result2);
        assertArrayEquals(expected3, result3);
        assertArrayEquals(expected4, result4);
        assertArrayEquals(expected5, result5);
    }
}