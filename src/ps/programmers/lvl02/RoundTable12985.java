package ps.programmers.lvl02;

public class RoundTable12985 {

    public int solution(int n, int a, int b)
    {

        int answer = 0;

        for (int i = 2; i <= n; i *= 2) {

            answer++;

            if (a % 2 == 0) {
                if (a - 1 == b) {
                    return answer;
                }
            } else {
                if (a + 1 == b) {
                    return answer;
                }
            }

            a = a % 2 == 1 ? a / 2 + 1 : a / 2;
            b = b % 2 == 1 ? b / 2 + 1 : b / 2;

        }

        return answer;
    }

}
