package test.programmers.lvl2;

import org.junit.Test;
import ps.programmers.greedy.BigNumberCreator42883;

import static org.junit.Assert.*;

public class BigNumberCreator42883Test {

    BigNumberCreator42883 bigNumberCreator42883 = new BigNumberCreator42883();

    @Test
    public void solution() {

        String expected = "94";
        String actual = bigNumberCreator42883.solution("1924", 2);

        String expected2 = "3234";
        String actual2 = bigNumberCreator42883.solution("1231234", 3);

        String expected3 = "775841";
        String actual3 = bigNumberCreator42883.solution("4177252841", 4);

        String expected4 = "66";
        String actual4 = bigNumberCreator42883.solution("322226566", 7);

        String expected5 = "11011";
        String actual5 = bigNumberCreator42883.solution("1000100011", 5);

        assertEquals(expected, actual);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);
        assertEquals(expected5, actual5);
    }
}