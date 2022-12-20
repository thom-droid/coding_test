package test.programmers.lvl2;

import org.junit.Test;
import ps.programmers.lvl02.BitDifference77885;

import static org.junit.Assert.*;

public class BitDifference77885Test {

    BitDifference77885 bitDifference77885 = new BitDifference77885();

    @Test
    public void solution() {

        long[] expected = {3, 11};
        long[] result = bitDifference77885.solution(new long[]{2, 7});

        long[] result2 = bitDifference77885.solution(new long[]{Long.MAX_VALUE});

        assertArrayEquals(expected, result);
    }
}