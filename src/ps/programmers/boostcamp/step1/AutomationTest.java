package ps.programmers.boostcamp.step1;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AutomationTest {

    Automation automation = new Automation();

    int[][] i1arg1 = new int[][]{{0, 10}, {50, 20}, {100, 30}};
    int[][] i1arg2 = new int[][]{{3, 50}, {7, 200}, {8, 200}};

    @Test
    public void solution2() {

        int expected = 5000;
        int actual = automation.solution2(i1arg1, i1arg2);

        assertEquals(expected, actual);

    }
}