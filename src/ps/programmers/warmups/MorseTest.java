package ps.programmers.warmups;

import org.junit.Test;

import static org.junit.Assert.*;

public class MorseTest {

    Morse morse = new Morse();

    @Test
    public void solution() {

        String expected = "python";
        String result = morse.solution(".--. -.-- - .... --- -.");
        assertEquals(expected, result);
    }
}