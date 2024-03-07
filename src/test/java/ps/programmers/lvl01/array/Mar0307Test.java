package ps.programmers.lvl01.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Mar0307Test {

    Mar0307 mar0307 = new Mar0307();

    @Test
    void solution() {
        String[][] board = {
                {"blue", "red", "orange", "red"},
                {"red", "red", "blue", "orange"},
                {"blue", "orange", "red", "red"},
                {"orange", "orange", "red", "blue"}
        };
        int h = 1;
        int w = 1;
        int expected = 2;
        int actual = mar0307.solution(board, h, w);
        assertEquals(expected, actual);
    }

    @Test
    void solution2() {
        String[][] board = {
                {"yellow", "green", "blue"},
                {"blue", "green", "yellow"},
                {"yellow", "blue", "blue"}
        };
        int h = 0;
        int w = 1;
        int expected = 1;
        int actual = mar0307.solution(board, h, w);
        assertEquals(expected, actual);
    }

    @Test
    void solution3() {
        String[][] board = {
                {"yellow", "green", "blue"},
                {"blue", "green", "yellow"},
                {"yellow", "blue", "blue"}
        };
        int h = 0;
        int w = 0;
        int expected = 0;
        int actual = mar0307.solution(board, h, w);
        assertEquals(expected, actual);
    }

    @Test
    void solution4() {
        String[][] board = {
                {"yellow", "green", "blue"},
                {"blue", "green", "yellow"},
                {"yellow", "blue", "blue"}
        };
        int h = 2;
        int w = 2;
        int expected = 1;
        int actual = mar0307.solution(board, h, w);
        assertEquals(expected, actual);
    }
}