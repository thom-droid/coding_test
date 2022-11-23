package test.programmers.lvl1;

import org.junit.Test;
import ps.programmers.warmups.Murmur;

import static org.junit.Assert.*;

public class MurmurTest {

    Murmur murmur = new Murmur();

    @Test
    public void solution() {

        int expected = 1;
        int result = murmur.solution(new String[]{"aya", "yee", "u", "maa", "wyeoo"});

        int expected2 = 3;
        int result2 = murmur.solution(new String[]{"ayaye", "uuuma", "ye", "yemawoo", "ayaa"});

        assertEquals(expected, result);
        assertEquals(expected2, result2);
    }
}