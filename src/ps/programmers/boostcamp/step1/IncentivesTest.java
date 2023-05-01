package ps.programmers.boostcamp.step1;

import org.junit.Test;

import static org.junit.Assert.*;

public class IncentivesTest {

    Incentives incentives = new Incentives();

    int i1arg1 = 43;
    int[] i1arg2 = new int[]{5, 3, 7, 6, 4};

    long expected1 = 150000L;

    @Test
    public void solutionThatNotPassedEfficiency() {

        long actual1 = incentives.solutionThatNotPassedEfficiency(i1arg1, i1arg2);

        assertEquals(expected1, actual1);
    }

    @Test
    public void solutionWithBinarySearch() {

        long actual1 = incentives.solutionWithBinarySearch(i1arg1, i1arg2);
        assertEquals(expected1, actual1);
    }
}