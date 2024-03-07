package ps.programmers.lvl01.simulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Mar0307_01Test {

    Mar0307_01 test = new Mar0307_01();

    @Test
    void solution() {
        int[][] a = {
                {1, 20300104, 100, 80},
                {2, 20300804, 847, 37},
                {3, 20300401, 10, 8}
        };
        String ext = "date";
        int val_ext = 20300501;
        String sortBy = "remain";

        int[][] expected = {
                {3, 20300401, 10, 8},
                {1, 20300104, 100, 80}
        };
        int[][] actual = test.solution(a, ext, val_ext, sortBy);
        assertArrayEquals(expected, actual);
    }
}