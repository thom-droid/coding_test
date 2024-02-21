package ps.programmers.warmups;

public class BallShare {

    public int solution(int balls, int share) {
        long[] dp = new long[balls + 1];
        dp[0] = dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i < dp.length; i++) {
            dp[i] = (dp[i - 1] * i) %10007 ;
        }

        long nom = dp[balls];
        long factor = dp[balls - share];
        long denom = factor * dp[share];
        return (int) (nom / denom);
    }


}
