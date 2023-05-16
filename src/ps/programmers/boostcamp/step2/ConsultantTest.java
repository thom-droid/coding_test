package ps.programmers.boostcamp.step2;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConsultantTest {

    Consultant consultant = new Consultant();

    String[][] i1arg1 = new String[][]{{"09:10", "lee"}};
    String[][] i1arg2 = new String[][]{{"09:00", "kim"}, {"09:05", "bae"}};

    String[][] i2arg1 = new String[][]{{"09:55","hae"},{"10:05", "jee"}};
    String[][] i2arg2 = new String[][]{{"10:04", "hee"}, {"14:07", "eom"}};

    String[][] i3arg1 = new String[][]{{"08:55", "a"}, {"09:10", "b"}, {"09:30", "c"}};
    String[][] i3arg2 = new String[][]{{"09:08", "g"}, {"09:12", "d"}, {"09:15", "e"}};

    String[] expected1 = new String[]{"kim", "lee", "bae"};
    String[] expected2 = new String[]{"hae", "jee", "hee", "eom"};
    String[] expected3 = new String[]{"a", "g", "b", "d", "c", "e"};

    @Test
    public void solution() {

        String[] actual1 = consultant.solution(i1arg1, i1arg2);
        String[] actual2 = consultant.solution(i2arg1, i2arg2);
        String[] actual3 = consultant.solution(i3arg1, i3arg2);

        assertArrayEquals(expected1, actual1);
        assertArrayEquals(expected2, actual2);
        assertArrayEquals(expected3, actual3);
    }
}