package ps.programmers.warmups;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiDimensionalArrayTest {

    MultiDimensionalArray multiDimensionalArray = new MultiDimensionalArray();

    @Test
    public void solution() {

        int[][] expected = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        int[][] result = multiDimensionalArray.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2);
        assertArrayEquals(expected, result);
    }
}