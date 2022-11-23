package test;

import org.junit.Test;
import ps.programmers.lvl01.SortString12917;

import static org.junit.Assert.*;

public class SortString12917Test {

    SortString12917 sortString12917 = new SortString12917();

    @Test
    public void solution() {

        String expected = "gfedcbZ";
        String result = sortString12917.solution("Zbcdefg");

        assertEquals(expected, result);
    }
}