package test.programmers.lvl1;

import org.junit.Test;
import ps.programmers.lvl01.MoneyNeeded;

import static org.junit.Assert.*;

public class MoneyNeededTest {

    MoneyNeeded moneyNeeded = new MoneyNeeded();

    @Test
    public void solution() {

        long expected = 10;
        long result = moneyNeeded.solution(3, 20, 4);

        assertEquals(expected, result);
    }
}