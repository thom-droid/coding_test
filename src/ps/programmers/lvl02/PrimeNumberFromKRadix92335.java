package ps.programmers.lvl02;

public class PrimeNumberFromKRadix92335 {

    public int solution(int n, int k) {

        String s = Integer.toString(n, k);
        String[] numbers = s.split("0");
        int answer = 0;

        for (String number : numbers) {
            if (number.isEmpty()) {
                continue;
            }

            long num = Long.parseLong(number);

            if (isPrime(num)) {
                answer++;
            }
        }

        return answer;
    }

    private boolean isPrime(long k) {

        if (k <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(k); i++) {
            if (k % i == 0) {
                return false;
            }
        }

        return true;
    }

}
