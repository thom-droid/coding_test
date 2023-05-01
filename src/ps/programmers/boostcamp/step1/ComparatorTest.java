package ps.programmers.boostcamp.step1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class ComparatorTest {

    @Test
    void givenRandomNumber_thenOrderedInLengthAndSize() {

        int[] ran = new int[]{3, 30, 34, 5, 9};
        Integer[] expected = new Integer[]{9, 5, 3, 34, 30};

        Comparator<Integer> comparator = (o1, o2) -> {
            String s1 = String.valueOf(o1);
            String s2 = String.valueOf(o2);

            if (s1.length() == s2.length()) {
                return o2 - o1;
            } else {
                return s1.length() - s2.length();
            }
        };

        Integer[] actual = Arrays.stream(ran).boxed().sorted(comparator).toArray(Integer[]::new);
        assertArrayEquals(expected, actual);
    }

    @Test
    void stringComparison() {

        int[] ran = new int[]{3, 30, 34, 5, 9};
        int[] ran2 = new int[]{8, 0, 110, 53, 91};
        int[] ran3 = new int[]{3, 10, 11, 4, 1, 78, 35};

        Integer[] expected = new Integer[]{9, 5, 34, 30, 3};
        Integer[] expected2 = new Integer[]{91, 8, 53, 110, 0};
        Integer[] expected3 = new Integer[]{78, 4, 35, 3, 11, 10, 1};

        Comparator<Integer> comparator = (o1, o2) -> String.valueOf(o2).compareTo(String.valueOf(o1));
        Integer[] actual = Arrays.stream(ran).boxed().sorted(comparator).toArray(Integer[]::new);
        Integer[] actual2 = Arrays.stream(ran2).boxed().sorted(comparator).toArray(Integer[]::new);
        Integer[] actual3 = Arrays.stream(ran3).boxed().sorted(comparator).toArray(Integer[]::new);

        assertArrayEquals(expected, actual);
        assertArrayEquals(expected2, actual2);
        assertArrayEquals(expected3, actual3);
    }

}
