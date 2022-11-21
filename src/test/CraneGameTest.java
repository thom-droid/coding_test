package test;

import org.junit.Test;
import ps.programmers.lvl01.CraneGame;

import static org.junit.Assert.*;

public class CraneGameTest {

    CraneGame craneGame = new CraneGame();

    @Test
    public void solution() {

        int expected = 4;
        int result = craneGame.solution(new int[][]{{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}}, new int[]{1, 5, 3, 5, 1, 2, 1, 4});

        assertEquals(expected, result);
    }
}