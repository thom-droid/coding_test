package test.programmers.lvl2;

import org.junit.Test;
import ps.programmers.lvl02.ContinuousBinarization70129;

import static org.junit.Assert.*;

public class ContinuousBinarization70129Test {

    ContinuousBinarization70129 continuousBinarization70129 = new ContinuousBinarization70129();

    @Test
    public void solution() {

        int[] expected = {3, 8};
        int[] result = continuousBinarization70129.solution("110010101001");
        int[] resultS2 = continuousBinarization70129.solution2("110010101001");

        int[] expected2 = {3, 3};
        int[] result2 = continuousBinarization70129.solution("01110");
        int[] resultS22 = continuousBinarization70129.solution2("01110");

        int[] expected3 = {4, 1};
        int[] result3 = continuousBinarization70129.solution("1111111");
        int[] resultS23 = continuousBinarization70129.solution2("1111111");

        assertArrayEquals(expected, result);
        assertArrayEquals(expected2, result2);
        assertArrayEquals(expected3, result3);

        assertArrayEquals(expected, resultS2);
        assertArrayEquals(expected2, resultS22);
        assertArrayEquals(expected3, resultS23);
    }
}