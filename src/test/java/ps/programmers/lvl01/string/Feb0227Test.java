package ps.programmers.lvl01.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Feb0227Test {

    Feb0227 feb0227 = new Feb0227();

    @Test
    void solution() {
        String t = "3141592";
        String p = "271";
        int expected = 2;
        int actual = feb0227.solution(t, p);
        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        String t = "500220839878";
        String p = "7";
        int expected = 8;
        int actual = feb0227.solution(t, p);
        assertEquals(expected, actual);
    }

    @Test
    void test3() {
        String t = "10203";
        String p = "15";
        int expected = 3;
        int actual = feb0227.solution(t, p);
        assertEquals(expected, actual);
    }

    @Test
    void test4() {
        String t = "100203";
        String p = "15";
        int expected = 4;
        int actual = feb0227.solution(t, p);
        assertEquals(expected, actual);
    }

    @Test
    void test5() {
        String t = "100203";
        String p = "150000";
        int expected = 1;
        int actual = feb0227.solution(t, p);
        assertEquals(expected, actual);
    }

    @Test
    void test6() {
        String t = "1002036";
        String p = "1543";
        int expected = 3;
        int actual = feb0227.solution(t, p);
        assertEquals(expected, actual);
    }

    @Test
    void test7() {
        String t = "100000000";
        String p = "1001";
        int expected = 6;
        int actual = feb0227.solution(t, p);
        assertEquals(expected, actual);
    }

    @Test
    void test8() {
        String t = "10";
        String p = "1";
        int expected = 2;
        int actual = feb0227.solution(t, p);
        assertEquals(expected, actual);
    }

    @Test
    void test9() {
        String t = "1234567890123456789";
        String p = "123456789012345678";
        int expected = 1;
        int actual = feb0227.solution(t, p);
        assertEquals(expected, actual);
    }
}