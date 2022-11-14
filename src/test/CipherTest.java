package test;

import org.junit.Test;
import ps.programmers.warmups.Cipher;

import static org.junit.jupiter.api.Assertions.*;

public class CipherTest {

    Cipher cipher = new Cipher();

    @Test
    public void cipherResultTest() {
        String expected = "attack";
        String result = cipher.solution("dfjardstddetckdaccccdegk", 4);

        assertEquals(expected, result);
    }
}