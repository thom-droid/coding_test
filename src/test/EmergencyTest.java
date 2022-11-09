package test;

import org.junit.Test;
import ps.programmers.warmups.Emergency;

import static org.junit.Assert.*;

public class EmergencyTest {

    Emergency emergency = new Emergency();

    @Test
    public void solution() {

        int[] expected = new int[]{3, 1, 2};
        int[] result = emergency.solution(new int[]{3, 76, 24});

        int[] expected2 = new int[]{7, 6, 5, 4, 3, 2, 1};
        int[] result2 = emergency.solution(new int[]{1, 2, 3, 4, 5, 6, 7});

        int[] expected3 = new int[]{2, 4, 3, 5, 1};
        int[] result3 = emergency.solution(new int[]{30, 10, 23, 6, 100});

        assertArrayEquals(expected,result);
        assertArrayEquals(expected2,result2);
        assertArrayEquals(expected3,result3);
    }
}