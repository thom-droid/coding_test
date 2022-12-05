package test.programmers.lvl2;

import org.junit.Test;
import ps.programmers.lvl02.TargetNumber43165;

import static org.junit.Assert.*;

public class TargetNumber43165Test {

    TargetNumber43165 targetNumber43165 = new TargetNumber43165();

    @Test
    public void solution() {
        int expected = 5;
        int result = targetNumber43165.solution2(new int[]{1, 1, 1, 1, 1}, 3);

        int result2 = targetNumber43165.solution(new int[]{1, 1, 1, 1, 1}, 3);
    }
}