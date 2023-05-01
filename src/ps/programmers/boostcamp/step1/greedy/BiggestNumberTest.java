package ps.programmers.boostcamp.step1.greedy;

import org.junit.Test;

import static org.junit.Assert.*;

public class BiggestNumberTest {

    BiggestNumber biggestNumber = new BiggestNumber();

    int[] input1 = new int[]{6, 10, 2};
    int[] input2 = new int[]{3, 30, 34, 5, 9};
    int[] input3 = new int[]{8, 0, 110, 53, 91};
    int[] input4 = new int[]{3, 10, 11, 4, 1, 78, 35};
    int[] input5 = new int[]{1, 1, 1, 1, 1, 2, 0};
    int[] input6 = new int[]{1, 0, 0, 0, 12, 13};
    int[] input7 = new int[]{10, 10, 1};

    String expected1 = "6210";
    String expected2 = "9534330";
    String expected3 = "918531100";
    String expected4 = "78435311110";
    String expected5 = "2111110";
    String expected6 = "13121000";
    String expected7 = "11010";

    @Test
    public void falsySolution() {

        String actual1 = biggestNumber.falsySolution(input1);
        String actual2 = biggestNumber.falsySolution(input2);
        String actual3 = biggestNumber.falsySolution(input3);
        String actual4 = biggestNumber.falsySolution(input4);

        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);

    }

    @Test
    public void solution() {

        String actual1 = biggestNumber.solution(input1);
        String actual2 = biggestNumber.solution(input2);
        String actual3 = biggestNumber.solution(input3);
        String actual4 = biggestNumber.solution(input4);
        String actual5 = biggestNumber.solution(input5);
        String actual6 = biggestNumber.solution(input6);
        String actual7 = biggestNumber.solution(input7);

        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);
        assertEquals(expected5, actual5);
        assertEquals(expected6, actual6);
        assertEquals(expected7, actual7);

    }

}