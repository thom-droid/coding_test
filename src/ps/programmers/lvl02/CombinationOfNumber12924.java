package ps.programmers.lvl02;

public class CombinationOfNumber12924 {

    public int solution(int n) {

        int answer = 0;

        for (int i = 1; i <= n; i++) {
            int tmp = n;
            int tmp2 = i;

            while (tmp > 0) {
                tmp -= tmp2;
                tmp2++;
            }

            if (tmp == 0) {
                answer++;
            }
        }

        return answer;
    }
}
