package test.programmers.lvl2;

import org.junit.Test;
import ps.programmers.lvl02.SavingBoat;

import static org.junit.Assert.*;

public class SavingBoatTest {

    SavingBoat savingBoat = new SavingBoat();

    @Test
    public void solution() {

        int expected = 3;
        int result = savingBoat.solution(new int[]{70, 50, 80, 50}, 100);
        int result3 = savingBoat.solution2(new int[]{70, 50, 80, 50}, 100);

        int expected2 = 3;
        int result2 = savingBoat.solution(new int[]{70, 80, 50}, 100);
        int result4 = savingBoat.solution2(new int[]{70, 80, 50}, 100);

        assertEquals(expected, result);
        assertEquals(expected2, result2);
        assertEquals(expected, result3);
        assertEquals(expected2, result4);
    }
}