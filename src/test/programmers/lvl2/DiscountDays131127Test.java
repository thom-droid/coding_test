package test.programmers.lvl2;

import org.junit.Test;
import ps.programmers.lvl02.DiscountDays131127;

import static org.junit.Assert.*;

public class DiscountDays131127Test {

    DiscountDays131127 discountDays131127 = new DiscountDays131127();

    @Test
    public void solution() {

        int expected = 3;
        int result = discountDays131127.solution(new String[]{"banana", "apple", "rice", "pork", "pot"}, new int[]{3, 2, 2, 2, 1}, new String[]{"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"});

        int expected2 = 0;
        int result2 = discountDays131127.solution(new String[]{"apple"}, new int[]{10}, new String[]{"banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana"});

        assertEquals(expected, result);
        assertEquals(expected2, result2);

    }
}