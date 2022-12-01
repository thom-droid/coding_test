package test.programmers.lvl2;

import org.junit.Test;
import ps.programmers.lvl02.ArrayManipulation87390;

import static org.junit.Assert.*;

public class ArrayManipulation87390Test {

    ArrayManipulation87390 arrayManipulation87390 = new ArrayManipulation87390();

    @Test
    public void solution() {

        int[] expected = {3, 2, 2, 3};
        int[] result = arrayManipulation87390.solution(3, 2, 5);

        int[] expected2 = {4, 3, 3, 3, 4, 4, 4, 4,};
        int[] result2 = arrayManipulation87390.solution(4, 7, 14);

        int[] result3 = arrayManipulation87390.solution(3, 2, 5);

        assertArrayEquals(expected, result);
        assertArrayEquals(expected2, result2);
    }
}