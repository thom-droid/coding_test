package test.programmers.lvl2;

import org.junit.Test;
import ps.programmers.lvl02.JadenCase12951;

import static org.junit.Assert.*;

public class JadenCase12951Test {

    JadenCase12951 jadenCase12951 = new JadenCase12951();

    @Test
    public void solution() {

        String expected = "3people Unfollowed Me";
        String result = jadenCase12951.solution("3people unFollowed me");

        String expected2 = "For The Last Week";
        String result2 = jadenCase12951.solution("for the last week");

        String expected3 = " A A Aa  A  A   ";
        String result3 = jadenCase12951.solution(" a a aa  a  a   ");

        String expected4 = "";
        String result4 = jadenCase12951.solution(" ");

        String expected5 = " A";
        String result5 = jadenCase12951.solution(" a");

        String expected6 = "B";
        String result6 = jadenCase12951.solution("b");

        assertEquals(expected, result);
        assertEquals(expected2, result2);
        assertEquals(expected3, result3);
        assertEquals(expected4, result4);
        assertEquals(expected5, result5);
        assertEquals(expected6, result6);


    }
}