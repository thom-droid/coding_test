package ps.programmers.sorting;

import java.util.Arrays;

public class KthNumber {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}})));
    }
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0];
            int end = commands[i][1];
            int idx = commands[i][2];
            int[] result = Arrays.stream(Arrays.copyOfRange(array, start -1, end)).sorted().toArray();
            answer[i] = result[idx - 1];
        }

        return answer;
    }
}

