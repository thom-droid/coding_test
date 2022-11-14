package test;

import org.junit.Test;
import ps.programmers.warmups.Undo;

import static org.junit.Assert.*;

public class UndoTest {

    Undo undo = new Undo();

    @Test
    public void solution() {

        int expected = 4 ;
        int result = undo.solution("1 2 Z 3");

        int expected2 = 100;
        int result2 = undo.solution("10 20 30 40");

        int expected3 = 1;
        int result3 = undo.solution("10 Z 20 Z 1");

        assertEquals(expected, result);
        assertEquals(expected2, result2);
        assertEquals(expected3, result3);
    }
}