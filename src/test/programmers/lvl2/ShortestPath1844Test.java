package test.programmers.lvl2;

import org.junit.Test;
import ps.programmers.lvl02.graph.ShortestPath1844;

import static org.junit.Assert.*;

public class ShortestPath1844Test {

    ShortestPath1844 shortestPath1844 = new ShortestPath1844();

    @Test
    public void solution() {
//        int expected = 11;
//        int result = shortestPath1844.solution(new int[][]{{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}});

        int expected2 = -1;
        int result2 = shortestPath1844.solution(new int[][]{{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 0}, {0, 0, 0, 0, 1}});

//        assertEquals(expected, result);
        assertEquals(expected2, result2);

    }

}