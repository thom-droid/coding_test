package ps.programmers.lvl01;

public class PrimeNumber12921 {

    public int solution(int n) {
        if (n <= 3) {
            return n - 1;
        }

        int answer = 2;

        for (int i = 4; i <= n; i++) {

            boolean isPrime = true;
            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                answer++;
            }
        }

        return answer;
    }
}
