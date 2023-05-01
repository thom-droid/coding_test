package ps.programmers.boostcamp.step1;

import org.junit.Test;

import static org.junit.Assert.*;

public class GovernmentBudgetTest {

    GovernmentBudget governmentBudget = new GovernmentBudget();

    int[] input1_arg1 = new int[]{120, 110, 140, 150};
    int input1_arg2 = 485;

    int expected = 127;

    @Test
    public void solutionThatNotPassedEfficiencyTest() {

        int actual = governmentBudget.solutionThatNotPassedEfficiencyTest(input1_arg1, input1_arg2);

        assertEquals(expected, actual);

    }

    @Test
    public void solutionWithBinarySearch() {

        int actual = governmentBudget.solution(input1_arg1, input1_arg2);

        assertEquals(expected, actual);
    }
}