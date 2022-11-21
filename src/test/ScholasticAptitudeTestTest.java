package test;

import org.junit.Test;
import ps.programmers.lvl01.ScholasticAptitudeTest;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ScholasticAptitudeTestTest {

    ScholasticAptitudeTest scholasticAptitudeTest = new ScholasticAptitudeTest();

    @Test
    public void solution() {

        int[] expected = new int[]{1};
        int[] result = scholasticAptitudeTest.solution2(new int[]{1, 2, 3, 4, 5});

        int[] expected2 = new int[]{1, 2, 3};
        int[] result2 = scholasticAptitudeTest.solution2(new int[]{1, 3, 2, 4, 2});

        int[] expected3 = new int[]{1};
        int[] result3 = scholasticAptitudeTest.solution2(new int[]{1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5});

        int[] expected4 = new int[]{1, 3};
        int[] arr = new int[10000];
        Arrays.fill(arr, 1);

        int[] result4 = scholasticAptitudeTest.solution2(arr);

        int[] expected5 = new int[]{2, 3};
        int[] result5 = scholasticAptitudeTest.solution2(new int[]{2, 3, 2, 1, 2});


        assertArrayEquals(expected, result);
        assertArrayEquals(expected2, result2);
        assertArrayEquals(expected3, result3);
        assertArrayEquals(expected4, result4);
        assertArrayEquals(expected5, result5);
    }
}