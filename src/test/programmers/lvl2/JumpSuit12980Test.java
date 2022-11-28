package test.programmers.lvl2;

import org.junit.Test;
import ps.programmers.lvl02.JumpSuit12980;

import static org.junit.Assert.*;

public class JumpSuit12980Test {

    JumpSuit12980 jumpSuit12980 = new JumpSuit12980();

    @Test
    public void solution() {

        int expected = 2;
        int result = jumpSuit12980.solution(5);

        int expected2 = 2;
        int result2 = jumpSuit12980.solution(6);

        int expected3 = 5;
        int result3 = jumpSuit12980.solution(5000);

        assertEquals(expected, result);
        assertEquals(expected2, result2);
        assertEquals(expected3, result3);
    }
}