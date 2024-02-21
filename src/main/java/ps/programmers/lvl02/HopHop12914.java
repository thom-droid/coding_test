package ps.programmers.lvl02;

public class HopHop12914 {
    public long solution(int n) {

        if (n <= 3) {
            return n;
        }

        long[] dp = new long[n + 1];

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i < dp.length; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567;
        }

        return dp[n];
    }
}
