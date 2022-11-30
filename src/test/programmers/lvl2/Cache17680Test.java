package test.programmers.lvl2;

import org.junit.Test;
import ps.programmers.lvl02.Cache17680;

import static org.junit.Assert.*;

public class Cache17680Test {

    Cache17680 cache17680 = new Cache17680();

    @Test
    public void solution() {

        int expected = 50;
        int result = cache17680.solution(3, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"});

        int expected2 = 21;
        int result2 = cache17680.solution(3, new String[]{"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"});

        int expected3 = 60;
        int result3 = cache17680.solution(2, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"});

        int expected4 = 52;
        int result4 = cache17680.solution(5, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"});

        int expected5 = 16;
        int result5 = cache17680.solution(2, new String[]{"Jeju", "Pangyo", "NewYork", "newyork"});

        int expected6 = 25;
        int result6 = cache17680.solution(0, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA"});

        int expected7 = 21;
        int result7 = cache17680.solution(2, new String[]{"a", "a", "a", "b", "b", "b", "c", "c", "c"});

        assertEquals(expected, result);
        assertEquals(expected2, result2);
        assertEquals(expected3, result3);
        assertEquals(expected4, result4);
        assertEquals(expected5, result5);
        assertEquals(expected6, result6);
        assertEquals(expected7, result7);
    }

}