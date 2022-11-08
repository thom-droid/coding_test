package ps.programmers.warmups;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringChangeTest {

    StringChange stringChange = new StringChange();

    @Test
    public void solution() {

        int result = stringChange.solution("olleh", "hello");
        int result2 = stringChange.solution("allpe", "apple");

        assertEquals(1, result);
        assertEquals(0, result2);
    }
}