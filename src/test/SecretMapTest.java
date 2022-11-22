package test;

import org.junit.Test;
import ps.programmers.lvl01.SecretMap;

import static org.junit.Assert.*;

public class SecretMapTest {

    SecretMap secretMap = new SecretMap();

    @Test
    public void solution() {

        String[] expected = {"#####", "# # #", "### #", "#  ##", "#####"};
        String[] result = secretMap.solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28});

        String[] expected2 = {"######", "###  #", "##  ##", " #### ", " #####", "### # "};
        String[] result2 = secretMap.solution(6, new int[]{46, 33, 33, 22, 31, 50}, new int[]{27, 56, 19, 14, 14, 10});

        assertArrayEquals(expected, result);
        assertArrayEquals(expected2, result2);
    }
}