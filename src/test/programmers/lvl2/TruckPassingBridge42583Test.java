package test.programmers.lvl2;

import org.junit.Test;
import ps.programmers.lvl02.stack_queue.TruckPassingBridge42583;

import static org.junit.Assert.*;

public class TruckPassingBridge42583Test {

    TruckPassingBridge42583 truckPassingBridge42583 = new TruckPassingBridge42583();

    @Test
    public void solution4() {
        int expected = 8;
        int result = truckPassingBridge42583.solution4(2, 10, new int[]{7, 4, 5, 6});

        int expected2 = 101;
        int result2 = truckPassingBridge42583.solution4(100, 100, new int[]{10});

        int expected3 = 7;
        int result3 = truckPassingBridge42583.solution4(2, 10, new int[]{4, 5, 4, 4, 6});
    }
}