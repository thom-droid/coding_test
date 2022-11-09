package test;

import org.junit.Test;
import ps.programmers.warmups.BinarySum;

import static org.junit.Assert.*;

public class BinarySumTest {

    BinarySum binarySum = new BinarySum();

    @Test
    public void solution() {

        String expected = "11000";
        String result = binarySum.solution("1001", "1111");

        String expected2 = "101";
        String result2 = binarySum.solution("10", "11");

        String expected3 = "1";
        String result3 = binarySum.solution("0", "1");

        String expected4 = "10";
        String result4 = binarySum.solution("10", "0");

        String expected5 = "1000000001";
        String result5 = binarySum.solution("1000000000", "1");

        String expected6 = "11111111110";
        String result6 = binarySum.solution("1111111111", "1111111111");

        assertEquals(expected, result);
        assertEquals(expected2, result2);
        assertEquals(expected3, result3);
        assertEquals(expected4, result4);
        assertEquals(expected5, result5);
        assertEquals(expected6, result6);

    }
}