package test.programmers.lvl2;

import org.junit.Test;
import ps.programmers.lvl02.StrangeCountry12899;

import static org.junit.Assert.*;

public class StrangeCountry12899Test {

    StrangeCountry12899 strangeCountry12899 = new StrangeCountry12899();

    @Test
    public void solution() {

        String expected = "11";
        String actual = strangeCountry12899.solution(4);

        String expected2 = "141";
        String actual2 = strangeCountry12899.solution(19);

        String expected3 = "41";
        String actual3 = strangeCountry12899.solution(10);

        String expected4 = "112";
        String actual4 = strangeCountry12899.solution(14);

        assertEquals(expected, actual);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);
    }

}