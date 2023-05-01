package ps.programmers.boostcamp.step1.greedy;

import org.junit.Test;

import static org.junit.Assert.*;

public class StationTest {

    Station station = new Station();

    @Test
    public void failedSolution() {

        int expected = 3;
        int actual = station.failedSolution(11, new int[]{4, 11}, 1);

        int expected2 = 3;
        int actual2 = station.failedSolution(16, new int[]{9}, 2);

        assertEquals(expected, actual);
        assertEquals(expected2, actual2);

    }


    @Test
    public void solution() {

        int expected = 3;
        int actual = station.solution(11, new int[]{4, 11}, 1);

        int expected2 = 3;
        int actual2 = station.solution(16, new int[]{9}, 2);

        assertEquals(expected, actual);
        assertEquals(expected2, actual2);
    }
}