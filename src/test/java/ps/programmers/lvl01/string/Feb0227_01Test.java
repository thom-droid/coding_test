package ps.programmers.lvl01.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Feb0227_01Test {

    Feb0227_01 feb0227_01 = new Feb0227_01();

    @Test
    void solution2() {
        String s = "banana";
        int[] expected = {-1, -1, -1, 2, 2, 2};
        int[] actual = feb0227_01.solution(s);
        assertArrayEquals(expected, actual);
    }

    @Test
    void solution3() {
        String s = "foobar";
        int[] expected = {-1, -1, 1, -1, -1, -1};
        int[] actual = feb0227_01.solution(s);
        assertArrayEquals(expected, actual);
    }

}