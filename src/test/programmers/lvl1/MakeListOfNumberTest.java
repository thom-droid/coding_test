package test.programmers.lvl1;

import org.junit.Test;
import ps.programmers.lvl01.MakeListOfNumber;

import static org.junit.Assert.*;

public class MakeListOfNumberTest {

    MakeListOfNumber makeListOfNumber = new MakeListOfNumber();

    @Test
    public void solution() {

        long[] expected = {2, 4, 6, 8, 10};
        long[] result = makeListOfNumber.solution(2, 5);

        assertArrayEquals(expected, result);
    }
}