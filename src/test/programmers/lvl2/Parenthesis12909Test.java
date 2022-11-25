package test.programmers.lvl2;

import org.junit.Test;
import ps.programmers.lvl02.Parenthesis12909;

import static org.junit.Assert.*;

public class Parenthesis12909Test {

    Parenthesis12909 parenthesis12909 = new Parenthesis12909();

    @Test
    public void solution() {

        boolean result = parenthesis12909.solution("()()");
        boolean result2 = parenthesis12909.solution("(())()");
        boolean result3 = parenthesis12909.solution(")()(");
        boolean result4 = parenthesis12909.solution("(()(");

        assertTrue(result);
        assertTrue(result2);
        assertFalse(result3);
        assertFalse(result4);

    }
}