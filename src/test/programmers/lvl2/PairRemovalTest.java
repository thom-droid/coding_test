package test.programmers.lvl2;

import org.junit.Test;
import ps.programmers.lvl02.PairRemoval;

import static org.junit.Assert.*;

public class PairRemovalTest {

    PairRemoval pairRemoval = new PairRemoval();

    @Test
    public void solution() {

        int expected = 1;
        int result = pairRemoval.solution("baabaa");

        int expected2 = 0;
        int result2 = pairRemoval.solution("cdcd");

        int expected3 = 1;
        int result3 = pairRemoval.solution2("baabaa");

        int expected4 = 0;
        int result4 = pairRemoval.solution2("cdcd");

        assertEquals(expected, result);
        assertEquals(expected2, result2);
        assertEquals(expected3, result3);
        assertEquals(expected4, result4);
    }
}