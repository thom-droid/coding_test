package test.programmers.lvl1;

import org.junit.Test;
import ps.programmers.lvl01.Budget;

import static org.junit.Assert.*;

public class BudgetTest {

    Budget budget = new Budget();

    @Test
    public void solution() {

        int expected = 3;
        int result = budget.solution(new int[]{1, 3, 2, 5, 4}, 9);

        int expected2 = 4;
        int result2 = budget.solution(new int[]{2, 2, 3, 3}, 10);

        assertEquals(expected, result);
        assertEquals(expected2, result2);
    }
}