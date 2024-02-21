package ps.programmers.boostcamp.step1;

import java.util.Arrays;

public class NumberGame {

    public int solution(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);
        int index = B.length - 1;
        int answer = 0;

        for (int i = A.length - 1; i >= 0; i--) {
            if (B[index] > A[i]) {
                answer++;
                index--;
                A[i] = 0;
            }
        }

        return answer;
    }
}
