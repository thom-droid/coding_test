package ps.programmers.lvl01.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Feb0221Test {

    Feb0221 feb0221 = new Feb0221();

    @Test
    void solution() {
        String[] arg1 = {"SOO", "OOO", "OOO"};
        String[] arg2 = {"E 2", "S 2", "W 1"};
        int[] expected = {2, 1};
        int[] result = feb0221.solution(arg1, arg2);
        assertArrayEquals(expected, result);
    }

    @Test
    void solution2() {
        String[] arg1 = {"SOO","OXX","OOO"};
        String[] arg2 = {"E 2","S 2","W 1"};
        int[] expected = {0, 1};
        int[] result = feb0221.solution(arg1, arg2);
        assertArrayEquals(expected, result);
    }

    @Test
    void solution3() {
        String[] arg1 = {"OSO","OOO","OXO","OOO"};
        String[] arg2 = {"E 2","S 3","W 1"};
        int[] expected = {0, 0};
        int[] result = feb0221.solution(arg1, arg2);
        assertArrayEquals(expected, result);
    }

    @Test
    void solution4() {
        String[] arg1 = {"S"};
        String[] arg2 = {"E 1"};
        int[] expected = {0, 0};
        int[] result = feb0221.solution(arg1, arg2);
        assertArrayEquals(expected, result);
    }

    @Test
    void solution5() {
        String[] arg1 = {"SOOXO", "OOOXO", "OXOOO", "XOOOO"};
        String[] arg2 = {"E 2", "S 2", "W 2", "S 1", "W 1"};
        int[] expected = {3, 1};
        int[] result = feb0221.solution(arg1, arg2);
        assertArrayEquals(expected, result);
    }

    @Test
    void solution6() {
        String[] arg1 = {"SOXXO", "OOOXO", "XXOOO", "XOOOO"};
        String[] arg2 = {"E 2", "S 2", "W 2", "S 1", "W 2"};
        int[] expected = {1, 0};
        int[] result = feb0221.solution(arg1, arg2);
        assertArrayEquals(expected, result);
    }
}