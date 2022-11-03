package ps.programmers.warmups;

import java.util.Arrays;

public class SlicingArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sliceArray(new int[]{1, 3, 5}, 1, 2)));
    }

    private static int[] sliceArray(int[] numbers, int num1, int num2) {
        int[] result = new int[num2 - num1 + 1];

        System.arraycopy(numbers, num1, result, 0, num2 - num1 + 1);

        return result;
    }
}
