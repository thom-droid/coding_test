package test;

import org.junit.Test;
import ps.programmers.lvl01.MatrixSum;

import static org.junit.Assert.*;

public class MatrixSumTest {

    MatrixSum matrixSum = new MatrixSum();

    @Test
    public void solution() {

        int[][] expected = {{4, 6}, {7, 9}};
        int[][] result = matrixSum.solution(new int[][]{{1, 2}, {2, 3}}, new int[][]{{3, 4}, {5, 6}});

        int[][] expected2 = {{4}, {6}};
        int[][] result2 = matrixSum.solution(new int[][]{{1}, {2}}, new int[][]{{3}, {4}});


        assertArrayEquals(expected, result);
        assertArrayEquals(expected2, result2);
    }
}