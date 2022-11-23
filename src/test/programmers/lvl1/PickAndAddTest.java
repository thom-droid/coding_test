package test.programmers.lvl1;

import org.junit.Test;
import ps.programmers.lvl01.PickAndAdd;

import static org.junit.Assert.*;

public class PickAndAddTest {
    PickAndAdd pickAndAdd = new PickAndAdd();

    @Test
    public void solution() {

        int[] expected = {2, 3, 4, 5, 6, 7};
        int[] result = pickAndAdd.solution(new int[]{2, 1, 3, 4, 1});

        int[] expected2 = {2, 5, 7, 9, 12};
        int[] result2 = pickAndAdd.solution(new int[]{5, 0, 2, 7});

        assertArrayEquals(expected, result);
        assertArrayEquals(expected2, result2);
    }
}