package ps.programmers.warmups;

import java.util.Arrays;

public class RemoveNumbers {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, new int[]{1,2,3,4,5,6,7,8,9,11,12})));
    }

    private static int[] solution(int n, int[] numlist) {

        return Arrays.stream(numlist).filter(e -> e % n == 0).toArray();
    }
}
