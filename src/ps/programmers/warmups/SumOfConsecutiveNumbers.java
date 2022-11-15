package ps.programmers.warmups;

public class SumOfConsecutiveNumbers {

    public int[] solution(int num, int total) {

        if (num == 1) {
            return new int[]{1};
        }

        int[] array = new int[num];

        int start = num % 2 == 0 ? -(num / 2 - 1) : -(num / 2);

        while (start < total) {
            int tmp = start;
            int sum = 0;
            for (int i = 0; i < num; i++) {
                sum += tmp;
                array[i] = tmp;
                tmp++;
            }

            if (sum == total) {
                return array;
            }

            start++;
        }

        return null;
    }
}
