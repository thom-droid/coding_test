package test.programmers.lvl2;

import org.junit.Test;
import ps.programmers.lvl02.graph.PrimeNumber42839;

import static org.junit.Assert.*;

public class PrimeNumber42839Test {

    PrimeNumber42839 primeNumber42839 = new PrimeNumber42839();

    @Test
    public void solution() {
        int answer = primeNumber42839.solution("123");
        //2,3, 13, 23, 31,
        int expected = 5;
        assertEquals(expected, answer);

        int answer2 = primeNumber42839.solution("17");
        int expected2 = 3;

        int answer3 = primeNumber42839.solution("011");
        int expected3 = 2;
    }
}