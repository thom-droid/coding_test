package test;

import org.junit.Test;
import ps.programmers.lvl01.PrimeNumberMaker;

import static org.junit.Assert.*;

public class PrimeNumberMakerTest {


    PrimeNumberMaker primeNumberMaker = new PrimeNumberMaker();

    @Test
    public void solution() {

        int expected = 1;
        int result = primeNumberMaker.solution(new int[]{1, 2, 3, 4});

        int expected2 = 4;
        int result2 = primeNumberMaker.solution(new int[]{1, 2, 7, 6, 4});

        assertEquals(expected, result);
        assertEquals(expected2, result2);
    }
}