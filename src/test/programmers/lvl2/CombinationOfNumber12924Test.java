package test.programmers.lvl2;

import org.junit.Test;
import ps.programmers.lvl02.CombinationOfNumber12924;

import static org.junit.Assert.*;

public class CombinationOfNumber12924Test {

    CombinationOfNumber12924 combinationOfNumber12924 = new CombinationOfNumber12924();

    @Test
    public void solution() {

        int expected = 4;
        int result = combinationOfNumber12924.solution(15);

        assertEquals(expected, result);
    }
}