package test.programmers.lvl2;

import org.junit.Test;
import ps.programmers.lvl02.Wordplay12981;

import static org.junit.Assert.*;

public class Wordplay12981Test {

    Wordplay12981 wordplay12981 = new Wordplay12981();

    @Test
    public void solution() {

        int[] expected = {3, 3};
        int[] result = wordplay12981.solution(3, new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"});

        int[] expected2 = {0, 0};
        int[] result2 = wordplay12981.solution(5, new String[]{"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"});

        int[] expected3 = {1, 3};
        int[] result3 = wordplay12981.solution(2, new String[]{"hello", "one", "even", "never", "now", "world", "draw"});

        assertArrayEquals(expected, result);
        assertArrayEquals(expected2, result2);
        assertArrayEquals(expected3, result3);
    }
}