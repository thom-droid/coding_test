package ps.programmers.lvl01;

import java.util.Arrays;

public class MissingNumbers {
    public int solution(int[] numbers) {
        int[] arr = new int[10];
        int answer = 0;

        for (int i = 0; i < numbers.length; i++) {
            arr[numbers[i]]++;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                answer += i;
            }
        }

        return answer;
    }

    public int solution2(int[] numbers) {

        int sum = 45;
        for (int number : numbers) {
            sum -= number;
        }

        return sum;
    }
}
