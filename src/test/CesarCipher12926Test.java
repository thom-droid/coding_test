package test;

import org.junit.Test;
import ps.programmers.lvl01.CesarCipher12926;

import static org.junit.Assert.*;

public class CesarCipher12926Test {

    CesarCipher12926 cesarCipher12926 = new CesarCipher12926();

    @Test
    public void solution() {

        String expected = "BC";
        String result = cesarCipher12926.solution("AB", 1);

        String expected2 = "a";
        String result2 = cesarCipher12926.solution("z", 1);

        String expected3 = "e F d";
        String result3 = cesarCipher12926.solution("a B z", 4);

        assertEquals(expected, result);
        assertEquals(expected2, result2);
        assertEquals(expected3, result3);
    }
}