package test;

import org.junit.Test;
import ps.programmers.warmups.Babbling2;

import static org.junit.Assert.*;

public class Babbling2Test {

    Babbling2 babbling2 = new Babbling2();

    @Test
    public void solution() {

        int expected = 1;
        int result = babbling2.solution(new String[]{"aya", "yee", "u", "maa"});

        int expected2 = 2;
        int result2 = babbling2.solution(new String[]{"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"});

        int expected3 = 1;
        int result3 = babbling2.solution(new String[]{"yayae", "wooma"});

        int expected4 = 1;
        int result4 = babbling2.solution(new String[]{"ayayeayawooayawoo"});

        assertEquals(expected, result);
        assertEquals(expected2, result2);
        assertEquals(expected3, result3);
        assertEquals(expected4, result4);

    }
}