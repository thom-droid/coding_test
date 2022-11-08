package ps.programmers.warmups;

import java.util.Arrays;

public class ArrayRotation {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveArrayToRight(new int[]{1,2,3,4,5})));
        System.out.println(Arrays.toString(moveArrayToLeft(new int[]{1,2,3,4,5})));
    }

    private static int[] solution(int[] numbers, String direction) {
        if (direction.equals("right")) {
            return moveArrayToRight(numbers);
        }

        return moveArrayToLeft(numbers);
    }

    private static int[] moveArrayToRight(int[] numbers) {
        int[] arr = new int[numbers.length];
        System.arraycopy(numbers, 0, arr, 1, numbers.length - 1);
        arr[0] = numbers[numbers.length - 1];
        return arr;
    }

    private static int[] moveArrayToLeft(int[] numbers) {
        int[] arr = new int[numbers.length];
        System.arraycopy(numbers, 1, arr, 0, numbers.length - 1);
        arr[arr.length - 1] = numbers[0];
        return arr;
    }
}
