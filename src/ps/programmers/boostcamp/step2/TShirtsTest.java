package ps.programmers.boostcamp.step2;

import org.junit.Test;

import static org.junit.Assert.*;

public class TShirtsTest {

    TShirts tShirts = new TShirts();

    int[] i1arg1 = new int[]{2, 3};
    int[] i1arg2 = new int[]{1, 2, 3};

    int[] i2arg1 = new int[]{1, 2, 3};
    int[] i2arg2 = new int[]{1, 1};

    int expected1 = 2;
    int expected2 = 1;

    @Test
    public void solution() {

        int actual1 = tShirts.solution(i1arg1, i1arg2);
        int actual2 = tShirts.solution(i2arg1, i2arg2);

        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
    }
}