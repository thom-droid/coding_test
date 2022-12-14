package test.programmers.lvl2;

import org.junit.Test;
import ps.programmers.lvl02.ParkingLotFare92341;

import static org.junit.Assert.*;

public class ParkingLotFare92341Test {

    ParkingLotFare92341 parkingLotFare92341 = new ParkingLotFare92341();

    @Test
    public void solution() {

        Integer[] expected = {14600, 34400, 5000};
        Integer[] result = parkingLotFare92341.solution(new int[]{180, 5000, 10, 600}, new String[]{"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"});

        Integer[] expected2 = {0, 591};
        Integer[] result2 = parkingLotFare92341.solution(new int[]{120, 0, 60, 591}, new String[]{"16:00 3961 IN", "16:00 0202 IN", "18:00 3961 OUT", "18:00 0202 OUT", "23:58 3961 IN"});

        Integer[] expected3 = {14841};
        Integer[] result3 = parkingLotFare92341.solution(new int[]{1, 461, 1, 10}, new String[]{"00:00 1234 IN"});

        assertArrayEquals(expected, result);
        assertArrayEquals(expected2, result2);
        assertArrayEquals(expected3, result3);
    }
}