package test;

import org.junit.Test;
import ps.programmers.warmups.ComingUp;

import static org.junit.Assert.*;

public class ComingUpTest {

    ComingUp comingUp = new ComingUp();

    @Test
    public void solution() {
        int expected = 5;
        int result = comingUp.solution(new int[]{1, 2, 3, 4});

        int expected2 = 16;
        int result2 = comingUp.solution(new int[]{2, 4, 8});

        int expected3 = 0;
        int result3 = comingUp.solution(new int[]{5, 4, 3, 2, 1});

    }
}