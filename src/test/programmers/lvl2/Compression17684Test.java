package test.programmers.lvl2;

import org.junit.Test;
import ps.programmers.lvl02.Compression17684;

import static org.junit.Assert.*;

public class Compression17684Test {

    Compression17684 compression17684 = new Compression17684();

    @Test
    public void solution() {

        Integer[] expected = {11, 1, 27, 15};
        Integer[] result = compression17684.solution("KAKAO");

        Integer[] expected2 = {20, 15, 2, 5, 15, 18, 14, 15, 20, 27, 29, 31, 36, 30, 32, 34};
        Integer[] result2 = compression17684.solution("TOBEORNOTTOBEORTOBEORNOT");

        Integer[] expected3 = {1, 2, 27, 29, 28, 31, 30};
        Integer[] result3 = compression17684.solution("ABABABABABABABAB");


        assertArrayEquals(expected, result);
        assertArrayEquals(expected2, result2);
        assertArrayEquals(expected3, result3);
    }
}