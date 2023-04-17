package test;

import org.junit.Test;
import ps.programmers.warmups.StringCompartment;

import static org.junit.Assert.*;

public class StringCompartmentTest {

    StringCompartment stringCompartment = new StringCompartment();

    @Test
    public void solution() {

        int actual1 = stringCompartment.solution("banana");
        int actual2 = stringCompartment.solution("abracadabra");
        int actual3 = stringCompartment.solution("aaabbaccccabba");

        int expected1 = 3;
        int expected2 = 6;
        int expected3 = 3;

        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);

    }
}