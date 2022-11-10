package test;

import org.junit.Test;
import ps.programmers.warmups.EnglishHater;

import static org.junit.Assert.*;

public class EnglishHaterTest {

    EnglishHater englishHater = new EnglishHater();

    @Test
    public void solution() {

        long expected = 123456789;
        long result = englishHater.solution("onetwothreefourfivesixseveneightnine");

        long expected2 = 14067;
        long result2 = englishHater.solution("onefourzerosixseven");

        assertEquals(expected, result);
        assertEquals(expected2, result2);
    }
}