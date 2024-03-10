package ps.programmers.lvl01.simulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Mar0308Test {

    Mar0308 test = new Mar0308();

    @Test
    void solution() {
        int[] a = {5, 1, 5};
        int health = 30;
        int[][] attacks = {
                {2, 10}, {9, 15}, {10, 5}, {11, 5}
        };
        int expected = 5;
        int actual = test.solution(a, health, attacks);
        assertEquals(expected, actual);
    }

    @Test
    void solution2() {
        int[] a = {3, 2, 7};
        int health = 20;
        int[][] attacks = {
                {1, 15}, {5, 16}, {8, 6}
        };
        int expected = -1;
        int actual = test.solution(a, health, attacks);
        assertEquals(expected, actual);
    }

    @Test
    void solution3() {
        int[] a = {4, 2, 7};
        int health = 20;
        int[][] attacks = {
                {1, 15}, {5, 16}, {8, 6}
        };
        int expected = -1;
        int actual = test.solution(a, health, attacks);
        assertEquals(expected, actual);
    }

    @Test
    void solution4() {
        int[] a = {1, 1, 1};
        int health = 5;
        int[][] attacks = {
                {1, 2}, {3, 2}
        };
        int expected = 3;
        int actual = test.solution(a, health, attacks);
        assertEquals(expected, actual);
    }
}