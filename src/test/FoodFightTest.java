package test;

import org.junit.Test;
import ps.programmers.lvl01.FoodFight;

import static org.junit.Assert.*;

public class FoodFightTest {

    FoodFight foodFight = new FoodFight();

    @Test
    public void solution() {

        String expected = "1223330333221";
        String result = foodFight.solution(new int[]{1, 3, 4, 6});

        String expected2 = "111303111";
        String result2 = foodFight.solution(new int[]{1, 7, 1, 2});

        assertEquals(expected, result);
        assertEquals(expected2, result2);
    }
}