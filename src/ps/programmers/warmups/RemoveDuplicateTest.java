package ps.programmers.warmups;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicateTest {

    RemoveDuplicate removeDuplicate = new RemoveDuplicate();

    @Test
    public void solution() {

        String expected = "We arthwold";
        String result = removeDuplicate.solution("We are the world");
        assertEquals(expected, result);

    }
}