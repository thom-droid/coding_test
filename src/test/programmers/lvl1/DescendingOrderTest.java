package test.programmers.lvl1;

import org.junit.Test;
import ps.programmers.lvl01.DescendingOrder;

import static org.junit.Assert.*;

public class DescendingOrderTest {

    DescendingOrder descendingOrder = new DescendingOrder();

    @Test
    public void solution() {

        long expected = 873211;
        long result = descendingOrder.solution(118372);

        assertEquals(expected, result);
    }
}