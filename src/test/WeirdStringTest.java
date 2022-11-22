package test;

import org.junit.Test;
import ps.programmers.lvl01.WeirdString;

import static org.junit.Assert.*;

public class WeirdStringTest {

    WeirdString weirdString = new WeirdString();

    @Test
    public void solution() {

        String expected = "TrY HeLlO WoRlD";
        String result = weirdString.solution3("try hello world");

        String expected2 = "  TrY HeLlO   WoRlD    ";
        String result2 = weirdString.solution("  tRy hello   WORLD    ");

        String expected3 = "";
        String result3 = weirdString.solution2("   try   hello world    ");

        assertEquals(expected, result);
//        assertEquals(expected2, result2);
    }
}