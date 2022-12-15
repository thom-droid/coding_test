package test.programmers.lvl2;

import org.junit.Test;
import ps.programmers.lvl02.SortFile17686;

import static org.junit.Assert.*;

public class SortFile17686Test {

    SortFile17686 sortFile17686 = new SortFile17686();

    @Test
    public void solution() {

        String[] expected = {"img1.png", "IMG01.GIF", "img02.png", "img2.JPG", "img10.png", "img12.png"};
        String[] result = sortFile17686.solution(new String[]{"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"});

        String[] expected2 = {"A-10 Thunderbolt II", "B-50 Superfortress", "F-5 Freedom Fighter", "F-14 Tomcat"};
        String[] result2 = sortFile17686.solution(new String[]{"F-5 Freedom Fighter", "B-50 Superfortress", "A-10 Thunderbolt II", "F-14 Tomcat"});

        assertArrayEquals(expected, result);
        assertArrayEquals(expected2, result2);
    }
}