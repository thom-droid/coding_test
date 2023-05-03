package ps.programmers.boostcamp.step1;

import org.junit.Test;

import static org.junit.Assert.*;

public class MagicalElevatorTest {

    MagicalElevator magicalElevator = new MagicalElevator();

    int i1 = 16;
    int i2 = 2554;
    int i3 = 9;
    int i4 = 1000;

    int e1 = 6;
    int e2 = 16;
    int e3 = 2;
    int e4 = 1;

    @Test
    public void solution() {

        int a1 = magicalElevator.solution(i1);
        int a2 = magicalElevator.solution(i2);
        int a3 = magicalElevator.solution(i3);

        assertEquals(e1, a1);
        assertEquals(e2, a2);
        assertEquals(e3, a3);

    }

    @Test
    public void solution2() {

        int a1 = magicalElevator.solution2(i1);
        int a2 = magicalElevator.solution2(i2);
        int a3 = magicalElevator.solution2(i3);
        int a4 = magicalElevator.solution2(i4);

        assertEquals(e1, a1);
        assertEquals(e2, a2);
        assertEquals(e3, a3);
        assertEquals(e4, a4);

    }
}