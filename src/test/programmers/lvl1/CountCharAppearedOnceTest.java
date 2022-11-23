package test.programmers.lvl1;

import org.junit.Test;
import ps.programmers.warmups.CountCharAppearedOnce;

import static org.junit.Assert.*;

public class CountCharAppearedOnceTest {

    CountCharAppearedOnce countCharAppearedOnce = new CountCharAppearedOnce();

    @Test
    public void solution() {

        String expected = "d";
        String result = countCharAppearedOnce.solution("abcabcadc");

        String expected2 = "abcd";
        String result2 = countCharAppearedOnce.solution("abdc");

        String expected3 = "eho";
        String result3 = countCharAppearedOnce.solution("hello");

        assertEquals(expected, result);
        assertEquals(expected2, result2);
        assertEquals(expected3, result3);
    }
}