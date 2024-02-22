package ps.programmers.greedy;

import java.util.Arrays;

public class Feb0222 {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int next = 0;
        for (int i : section) {
            if (next < i) {
                answer++;
                next = i + m - 1;
            }
        }
        return answer;
    }
}
