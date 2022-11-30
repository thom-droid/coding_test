package test.programmers.lvl2;

import org.junit.Test;
import ps.programmers.lvl02.MatrixMultiple12949;

import static org.junit.Assert.*;

public class MatrixMultiple12949Test {

    MatrixMultiple12949 matrixMultiple12949 = new MatrixMultiple12949();

    @Test
    public void solution() {

        int[][] expected = new int[][]{{10, 20}, {10, 20}};
        int[][] result = matrixMultiple12949.solution(new int[][]{{1, 2, 3, 4}, {1, 2, 3, 4}}, new int[][]{{1, 2}, {1, 2}, {1, 2}, {1, 2}});

        assertArrayEquals(expected, result);
    }
}