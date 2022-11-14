package test;

import org.junit.Test;
import ps.programmers.warmups.CursedNumberThree;

import static org.junit.Assert.*;

public class CursedNumberThreeTest {

    CursedNumberThree cursedNumberThree = new CursedNumberThree();

    @Test
    public void solution() {

        int expected = 25;
        int result = cursedNumberThree.solution(15);

        int expected2 = 76;
        int result2 = cursedNumberThree.solution(40);

        int expected3 = 4;
        int result3 = cursedNumberThree.solution(3);

        int expected4 = 16;
        int result4 = cursedNumberThree.solution(10);

        int expected5 = 14;
        int result5 = cursedNumberThree.solution(9);

        int expected6 = 140;
        int result6 = cursedNumberThree.solution(73);

        assertEquals(expected, result);
        assertEquals(expected2, result2);
        assertEquals(expected3, result3);
        assertEquals(expected4, result4);
        assertEquals(expected5, result5);
        assertEquals(expected6, result6);


    }
}