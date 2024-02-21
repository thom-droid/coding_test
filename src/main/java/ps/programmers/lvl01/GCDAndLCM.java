package ps.programmers.lvl01;

public class GCDAndLCM {

    public int[] solution(int n, int m) {

        int gcd = 1;
        for (int i = 1; i <= n && i <= m; i++) {

            if (n % i == 0 && m % i == 0) {
                gcd = i;
            }
        }

        int lcm = n * m;

        for (int i = n * m; i >= n && i >= m; i--) {
            if (i % n == 0 && i % m == 0) {
                lcm = i;
            }
        }

        return new int[]{gcd, lcm};
    }

}
