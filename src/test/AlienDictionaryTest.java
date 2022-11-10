package test;

import org.junit.Test;
import ps.programmers.warmups.AlienDictionary;

import static org.junit.Assert.*;

public class AlienDictionaryTest {

    AlienDictionary alienDictionary = new AlienDictionary();

    @Test
    public void solution() {

        int expected = 2;
        int result = alienDictionary.solution(new String[]{"p", "o", "s"}, new String[]{"sod", "eocd", "qixm", "adio", "soo"});

        int expected2 = 1;
        int result2 = alienDictionary.solution(new String[]{"z", "d", "x"}, new String[]{"def", "dww", "dzx", "loveaw"});

        int expected3 = 2;
        int result3 = alienDictionary.solution(new String[]{"s", "o", "m", "d"}, new String[]{"moos", "dzx", "smm", "sunmmo", "som"});

        assertEquals(expected, result);
        assertEquals(expected2, result2);
        assertEquals(expected3, result3);
    }
}