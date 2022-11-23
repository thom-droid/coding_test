package test.programmers.lvl1;

import org.junit.Test;
import ps.programmers.lvl01.MBTI;

import static org.junit.Assert.*;

public class MBTITest {

    MBTI mbti = new MBTI();

    @Test
    public void solution() {

        String expected = "TCMA";
        String result = mbti.solution(new String[]{"AN", "CF", "MJ", "RT", "NA"}, new int[]{5, 3, 2, 7, 5});

        String expected2 = "RCJA";
        String result2 = mbti.solution(new String[]{"TR", "RT", "TR"}, new int[]{7, 1, 3});

        assertEquals(expected, result);
        assertEquals(expected2, result2);

    }
}