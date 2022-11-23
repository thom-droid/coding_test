package test.programmers.lvl1;

import org.junit.Test;
import ps.programmers.lvl01.DartGame;

import static org.junit.Assert.*;

public class DartGameTest {

    DartGame dartGame = new DartGame();

    @Test
    public void solution() {

        int expected = 37;
        int result = dartGame.solution("1S2D*3T");

        int expected2 = 9;
        int result2 = dartGame.solution("1D2S#10S");

        int expected3 = 3;
        int result3 = dartGame.solution("1D2S0T");

        int expected4 = 23;
        int result4 = dartGame.solution("1S*2T*3S");

        int expected5 = 5;
        int result5 = dartGame.solution("1D#2S*3S");

        int expected6 = -4;
        int result6 = dartGame.solution("1T2D3D#");

        int expected7 = 59;
        int result7 = dartGame.solution("1D2S3T*");

        assertEquals(expected, result);
        assertEquals(expected2, result2);
        assertEquals(expected3, result3);
        assertEquals(expected4, result4);
        assertEquals(expected5, result5);
        assertEquals(expected6, result6);
        assertEquals(expected7, result7);
    }
}