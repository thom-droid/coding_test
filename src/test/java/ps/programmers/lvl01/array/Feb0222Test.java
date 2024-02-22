package ps.programmers.lvl01.array;

import org.junit.jupiter.api.Test;
import ps.programmers.greedy.Feb0222;

import static org.junit.jupiter.api.Assertions.*;

class Feb0222Test {

    Feb0222 feb0222 = new Feb0222();

    @Test
    void solution() {
        int n = 10;
        int m = 4;
        int[] section = {1, 2, 3, 4, 7, 10};
        int expected = 2;
        int result = feb0222.solution(n, m, section);
        assertEquals(expected, result);
    }

    @Test
    void solution2() {
        int n = 8;
        int m = 4;
        int[] section = {2, 3, 6};
        int expected = 2;
        int result = feb0222.solution(n, m, section);
        assertEquals(expected, result);
    }

    @Test
    void solution3() {
        int n = 5;
        int m = 4;
        int[] section = {1, 3};
        int expected = 1;
        int result = feb0222.solution(n, m, section);
        assertEquals(expected, result);
    }

    @Test
    void solution4() {
        int n = 4;
        int m = 1;
        int[] section = {1, 2, 3, 4};
        int expected = 4;
        int result = feb0222.solution(n, m, section);
        assertEquals(expected, result);
    }
}