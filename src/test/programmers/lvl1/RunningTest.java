package test.programmers.lvl1;

import org.junit.Test;
import ps.programmers.lvl01.Running;

import static org.junit.Assert.*;

public class RunningTest {

    Running running = new Running();

    @Test
    public void solution() {

        String[] expected = new String[]{"mumu", "kai", "mine", "soe", "poe"};
        String[] actual = running.solution(new String[]{"mumu", "soe", "poe", "kai", "mine"}, new String[]{"kai", "kai", "mine", "mine"});

        assertArrayEquals(expected, actual);
    }
}