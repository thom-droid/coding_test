package ps.programmers.boostcamp.step1;

import org.junit.Test;

import static org.junit.Assert.*;

public class CoinFlipTest {
    CoinFlip coinFlip = new CoinFlip();

    int[] i1arg1 = new int[]{0,1,1,0,1,1};
    int i1arg2 = 3;
    int[] i2arg1 = new int[]{0, 0, 1, 1, 0, 0};
    int i2arg2 = 2;

    int expected1 = 2;
    int expected2 = 1;

    @Test
    public void solution() {

        int actual1 = coinFlip.solution(i1arg1, i1arg2);
        int actual2 = coinFlip.solution(i2arg1, i2arg2);

        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
    }
}