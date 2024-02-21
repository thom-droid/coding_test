package ps.programmers.lvl01;

public class Square {

    public long solution(long n) {
        boolean isSquare = false;

        if (n == 1) {
            return 4;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isSquare = (long) i * i == n;
            }

            if (isSquare) {
                return (long) (i + 1) * (i + 1);
            }
        }

        return -1;
    }
}
