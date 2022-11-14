package test;

import org.junit.Test;
import ps.programmers.warmups.Quiz;

import static org.junit.Assert.*;

public class QuizTest {

    Quiz quiz = new Quiz();

    @Test
    public void solution() {

        String[] expected = {"X", "O"};
        String[] result = quiz.solution(new String[]{"3 - 4 = -3", "5 + 6 = 11"});

        String[] expected2 = {"O", "O", "X", "O"};
        String[] result2 = quiz.solution(new String[]{"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"});

        String[] expected3 = {"O", "O"};
        String[] result3 = quiz.solution(new String[]{"-10000 - -10000 = 0", "10 - 10 = 0"});

        assertArrayEquals(expected, result);
        assertArrayEquals(expected2, result2);
        assertArrayEquals(expected3, result3);
    }
}