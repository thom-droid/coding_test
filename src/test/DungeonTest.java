package test;

import org.junit.Test;
import ps.programmers.warmups.Dungeon;

import static org.junit.Assert.*;

public class DungeonTest {

    Dungeon dungeon = new Dungeon();

    @Test
    public void solution() {

        int[] expected = {2, 1};
        int[] result = dungeon.solution(new String[]{"left", "right", "up", "right", "right"}, new int[]{11, 11});

        int[] expected2 = {0, -4};
        int[] result2 = dungeon.solution(new String[]{"down", "down", "down", "down", "down"}, new int[]{7, 9});

        assertArrayEquals(expected, result);
        assertArrayEquals(expected2, result2);
    }
}