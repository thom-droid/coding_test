package test.programmers.lvl1;

import org.junit.Test;
import ps.programmers.lvl01.WeaponsForKnights136798;

import static org.junit.Assert.*;

public class WeaponsForKnights136798Test {

    WeaponsForKnights136798 weaponsForKnights136798 = new WeaponsForKnights136798();

    @Test
    public void solution() {

        int expected = 10;
        int result = weaponsForKnights136798.solution(5, 3, 2);

        int expected2 = 21;
        int result2 = weaponsForKnights136798.solution(10, 3, 2);

        assertEquals(expected, result);
        assertEquals(expected2, result2);
    }
}