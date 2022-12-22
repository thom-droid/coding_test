package ps.programmers.lvl02;

public class N2Tile12900 {

    public int solution(int n) {
        if (n <= 2) {
            return n;
        }

        int[] dp = new int[n + 1];

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i < dp.length; i++) {
            dp[i] = (dp[i - 2] + dp[i - 1]) % 1000000007;
        }

        return dp[n];
    }
}
