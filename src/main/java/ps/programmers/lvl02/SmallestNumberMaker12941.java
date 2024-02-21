package ps.programmers.lvl02;

import java.util.Arrays;

public class SmallestNumberMaker12941 {

    public int solution(int []A, int []B)
    {
        Arrays.sort(A);
        Arrays.sort(B);

        int answer = 0;

        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[B.length - i - 1];
        }

        return answer;
    }
}
