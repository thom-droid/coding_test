package test.programmers.lvl2;

import org.junit.Test;
import ps.programmers.lvl02.StockPrice42584;

import static org.junit.Assert.*;

public class StockPrice42584Test {

    StockPrice42584 stockPrice42584 = new StockPrice42584();

    @Test
    public void solution() {

        int[] expected = {4, 3, 1, 1, 0};
        int[] result = stockPrice42584.solution(new int[]{1, 2, 3, 2, 3});

        int[] expected2 = {7, 6, 5, 4, 3, 2, 1, 0};
        int[] result2 = stockPrice42584.solution(new int[]{1, 1, 1, 3, 3, 3, 3, 2});

        int[] expected3 = {2, 1, 1, 1, 0};
        int[] result3 = stockPrice42584.solution(new int[]{5, 5, 4, 2, 3});


        assertArrayEquals(expected, result);
        assertArrayEquals(expected2, result2);
        assertArrayEquals(expected3, result3);
    }
}