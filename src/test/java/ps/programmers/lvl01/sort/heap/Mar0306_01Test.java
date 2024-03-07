package ps.programmers.lvl01.sort.heap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Mar0306_01Test {

    Mar0306_01 test = new Mar0306_01();

    @Test
    void solution() {
        int k = 3;
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        int[] expected = {10, 10, 10, 20, 20, 100, 100};
        int[] actual = test.solution(k, score);
        assertArrayEquals(expected, actual);
    }

    @Test
    void solution2() {
        int k = 4;
        int[] score = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
        int[] expected = {0, 0, 0, 0, 20, 40, 70, 70, 150, 300};
        int[] actual = test.solution(k, score);
        assertArrayEquals(expected, actual);
    }
}