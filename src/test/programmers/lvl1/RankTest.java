package test.programmers.lvl1;


import org.junit.Test;
import ps.programmers.warmups.Rank;

import static org.junit.Assert.*;


public class RankTest {

    Rank rank = new Rank();

    @Test
    public void solution() {


        int[] expected = {1, 2, 4, 3};
        int[] result = rank.solution(new int[][]{{80, 70}, {90, 50}, {40, 70}, {50, 80}});

        int[] expected2 = {4, 4, 6, 2, 2, 1, 7};
        int[] result2 = rank.solution(new int[][]{{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}});

        int[] expected3 = {1, 1, 1, 1, 1};
        int[] result3 = rank.solution(new int[][]{{50, 50}, {50, 50}, {50, 50}, {50, 50}, {50, 50}});


        int[] expected4 = {1, 2, 2};
        int[] result4 = rank.solution(new int[][]{{1, 2}, {1, 1}, {1, 1}});

        assertArrayEquals(expected, result);
        assertArrayEquals(expected2, result2);
        assertArrayEquals(expected3, result3);

    }
}