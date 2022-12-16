package test.programmers.lvl2;

import org.junit.Test;
import ps.programmers.lvl02.VowelDictionary84512;

import static org.junit.Assert.*;

public class VowelDictionary84512Test {

    VowelDictionary84512 vowelDictionary84512 = new VowelDictionary84512();

    @Test
    public void solution() {

//        int expected = 6;
//        int result = vowelDictionary84512.solution2("AAAAE");

//        int expected2 = 10;
//        int result2 = vowelDictionary84512.solution2("AAAE");

        int expected3 = 1563;
        int result3 = vowelDictionary84512.solution2("I");

        int expected4 = 1189;
        int result4 = vowelDictionary84512.solution2("EIO");

//        assertEquals(expected, result);
//        assertEquals(expected2, result2);
        assertEquals(expected3, result3);
        assertEquals(expected4, result4);

    }
}