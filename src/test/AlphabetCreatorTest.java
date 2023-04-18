package test;

import org.junit.Test;
import ps.programmers.warmups.AlphabetCreator;

import static org.junit.Assert.*;

public class AlphabetCreatorTest {

    AlphabetCreator alphabetCreatorTest = new AlphabetCreator();

    @Test
    public void solution() {
        String input = "aukks";
        String input2 = "wbqd";
        int input3 = 5;
        String actual = alphabetCreatorTest.solution(input, input2, input3);
        String expected = "happy";

        String actual2 = alphabetCreatorTest.solution("abcde", "fghij", 4);
        String expected2 = "eklmn";

        String actual3 = alphabetCreatorTest.solution("zzzzz", "ab", 1);
        String expected3 = "ccccc";

        String actual4 = alphabetCreatorTest.solution("z", "abcdefghij", 20);
        String expected4 = "n";

        assertEquals(expected, actual);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);
    }
}