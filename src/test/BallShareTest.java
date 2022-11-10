package test;

import org.junit.Test;
import ps.programmers.warmups.BallShare;

import static org.junit.Assert.*;

public class BallShareTest {

    BallShare ballShare = new BallShare();

    @Test
    public void solution() {

        int expected = 3;
        int result = ballShare.solution(3, 2);

        int expected2 = 10;
        int result2 = ballShare.solution(5, 3);

        int expected3 = 1;
        int result3 = ballShare.solution(30,30);
        assertEquals(expected, result);
        assertEquals(expected2, result2);
    }
}