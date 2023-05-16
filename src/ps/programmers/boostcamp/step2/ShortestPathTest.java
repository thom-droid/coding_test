package ps.programmers.boostcamp.step2;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShortestPathTest {

    ShortestPath shortestPath = new ShortestPath();
    int[][] i1arg1 = new int[][]{{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}};
    int[][] i2arg1 = new int[][]{{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 0}, {0, 0, 0, 0, 1}};

    int expected1 = 11;
    int expected2 = -1;

    @Test
    public void solution() {

        int actual1 = shortestPath.solution(i1arg1);
        int actual2 = shortestPath.solution(i2arg1);

        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
    }
}