package test.programmers.lvl2;

import org.junit.Test;
import ps.programmers.lvl02.stack_queue.Parenthesis76502;

import static org.junit.Assert.*;

public class Parenthesis76502Test {

    Parenthesis76502 parenthesis76502 = new Parenthesis76502();

    @Test
    public void solution() {

        int expected = 3;
        int result = parenthesis76502.solution("[](){}");

        int expected2 = 2;
        int result2 = parenthesis76502.solution("}]()[{");

        int expected3 = 0;
        int result3 = parenthesis76502.solution("[)(]");

        int expected4 = 0;
        int result4 = parenthesis76502.solution("}}}");

        assertEquals(expected, result);
        assertEquals(expected2, result2);
        assertEquals(expected3, result3);
        assertEquals(expected4, result4);
    }
}