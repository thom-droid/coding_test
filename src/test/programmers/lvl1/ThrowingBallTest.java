package test.programmers.lvl1;

import org.junit.Test;
import ps.programmers.warmups.ThrowingBall;

import static org.junit.Assert.*;

public class ThrowingBallTest {

    ThrowingBall throwingBall = new ThrowingBall();

    @Test
    public void solution() {

        int expected = 3;
        int result = throwingBall.solution(new int[]{1,2,3,4}, 2);

        int expected2 = 3;
        int result2 = throwingBall.solution(new int[]{1,2,3,4,5,6}, 5);

        int expected3 = 2;
        int result3 = throwingBall.solution(new int[]{1,2,3}, 3);

        assertEquals(expected, result);
        assertEquals(expected2, result2);
        assertEquals(expected3, result3);



    }
}