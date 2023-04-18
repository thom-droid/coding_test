package test.programmers.lvl1;

import org.junit.Test;
import ps.programmers.lvl01.KeyBoard;

import static org.junit.Assert.*;

public class KeyBoardTest {

    KeyBoard keyBoard = new KeyBoard();

    @Test
    public void solution() {

        int[] expected1 = new int[]{9, 4};
        int[] actual1 = keyBoard.solution(new String[]{"ABACD", "BCEFD"}, new String[]{"ABCD", "AABB"});

        int[] expected2 = new int[]{-1};
        int[] actual2 = keyBoard.solution(new String[]{"AA"}, new String[]{"B"});

        int[] expected3 = new int[]{4, 6};
        int[] actual3 = keyBoard.solution(new String[]{"AGZ", "BSSS"}, new String[]{"ASA", "BGZ"});

        assertArrayEquals(expected1, actual1);
        assertArrayEquals(expected2, actual2);
        assertArrayEquals(expected3, actual3);
    }
}