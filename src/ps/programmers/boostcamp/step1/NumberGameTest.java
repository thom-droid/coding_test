package ps.programmers.boostcamp.step1;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberGameTest {

    NumberGame numberGame = new NumberGame();

    int[] i1arg1 = new int[]{5, 1, 3, 7};
    int[] i1arg2 = new int[]{2, 2, 6, 8};
    int[] i2arg1 = new int[]{2, 2, 2, 2};
    int[] i2arg2 = new int[]{1, 1, 1, 1};

    int expected1 = 3;
    int expected2 = 0;

    @Test
    public void solution() {
        int actual = numberGame.solution(i1arg1, i1arg2);
        int actual2 = numberGame.solution(i2arg1, i2arg2);

        assertEquals(expected1, actual);
        assertEquals(expected2, actual2);

    }
}