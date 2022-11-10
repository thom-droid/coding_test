package test;

import org.junit.Test;
import ps.programmers.warmups.Factorization;

import static org.junit.Assert.*;

public class FactorizationTest {

    Factorization factorization = new Factorization();

    @Test
    public void solution() {

        int[] expected = {2, 3};
        int[] result = factorization.solution(12);

        int[] expected2 = {17};
        int[] result2 = factorization.solution(17);

        int[] expected3 = {2, 3, 5, 7};
        int[] result3 = factorization.solution(420);

        assertArrayEquals(expected, result);
        assertArrayEquals(expected2, result2);
        assertArrayEquals(expected3, result3);
    }
}