package test.programmers.lvl2;

import org.junit.Test;
import ps.programmers.lvl02.NewClustering17677;

import static org.junit.Assert.*;

public class NewClustering17677Test {

    NewClustering17677 newClustering17677 = new NewClustering17677();
    @Test
    public void solution() {

        int expected = 16384;
        int result = newClustering17677.solution("FRANCE", "french");

        int expected2 = 65536;
        int result2 = newClustering17677.solution("handshake", "shake hands");

        int expected3 = 43690;
        int result3 = newClustering17677.solution("aa1+aa2", "AAAA12");

        int expected4 = 65536;
        int result4 = newClustering17677.solution("E=M*C^2", "e=m*c^2");

        int expected5 = (int) (((double) 1 / 8) * 65536);
        int result5 = newClustering17677.solution("ab ab ab ef", "ab cd cd cd cd");

        int expected6 = 32768;
        int result6 = newClustering17677.solution("BAAAA", "AAA");

//        int result7 = newClustering17677.solution("aa aa bb bb cc", "aa bb bb dd ee");

        int expected7 = 16384;
        int result7 = newClustering17677.solution(" abc", "abbb");

        int expected8 = 32768;
        int result8 = newClustering17677.solution("aa1+aa2", "AA12");

        int expected9 = (int) ((5.0 / 7 ) * 65536);
        int result9 = newClustering17677.solution("aaabbbb", "aaaabbb");

        assertEquals(expected, result);
        assertEquals(expected2, result2);
        assertEquals(expected3, result3);
        assertEquals(expected4, result4);
        assertEquals(expected5, result5);
        assertEquals(expected6, result6);
        assertEquals(expected7, result7);
        assertEquals(expected8, result8);
        assertEquals(expected9, result9);


    }
}