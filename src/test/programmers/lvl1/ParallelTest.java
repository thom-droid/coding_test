package test.programmers.lvl1;

import org.junit.Test;
import ps.programmers.warmups.Parallel;

import static org.junit.Assert.*;

public class ParallelTest {

    Parallel parallel = new Parallel();

    @Test
    public void solution() {
        int expected = 1;
        int result = parallel.solution(new int[][]{{1, 4}, {9, 2}, {3, 8}, {11, 6}});

        int expected2 = 0;
        int result2 = parallel.solution(new int[][]{{3, 5}, {4, 1}, {2, 4}, {5, 10}});

        assertEquals(expected, result);
        assertEquals(expected2, result2);
    }
}