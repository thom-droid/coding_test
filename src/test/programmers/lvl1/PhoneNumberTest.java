package test.programmers.lvl1;

import org.junit.Test;
import ps.programmers.lvl01.PhoneNumber;

import static org.junit.Assert.*;

public class PhoneNumberTest {

    PhoneNumber phoneNumber = new PhoneNumber();

    @Test
    public void solution() {
        String expected = "*******4444";
        String result = phoneNumber.solution("01033334444");

        String expected2 = "*****8888";
        String result2 = phoneNumber.solution("027778888");

        assertEquals(expected, result);
        assertEquals(expected2, result2);
    }
}