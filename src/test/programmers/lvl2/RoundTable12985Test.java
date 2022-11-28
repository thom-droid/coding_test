package test.programmers.lvl2;

import org.junit.Test;
import ps.programmers.lvl02.RoundTable12985;

import static org.junit.Assert.*;

public class RoundTable12985Test {

    RoundTable12985 roundTable12985 = new RoundTable12985();


    @Test
    public void solution() {

        int expected = 3;
        int result = roundTable12985.solution(8, 4, 7);
        int result2 = roundTable12985.solution(8, 4, 5);

        assertEquals(expected, result);
        assertEquals(expected, result2);
    }
}