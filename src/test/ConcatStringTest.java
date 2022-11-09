package test;

import org.junit.Test;
import ps.programmers.warmups.ConcatString;

import static org.junit.Assert.*;

public class ConcatStringTest {

    ConcatString concatString = new ConcatString();

    @Test
    public void solution() {

        String[] expected = {"abc1Ad", "dfggg4", "556b"};
        String[] result = concatString.solution("abc1Addfggg4556b", 6);

        String[] expected2 = {"abc", "def", "123"};
        String[] result2 = concatString.solution("abcdef123", 3);

        assertArrayEquals(expected, result);
        assertArrayEquals(expected2, result2);
    }

}