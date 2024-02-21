package ps.baekjun.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LIS11055 {

    private static int[] dp;
    private static int[] num;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp = new int[n];
        num = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        dp[0] = num[0];

        for (int i = 1; i < n; i++) {
            dp[i] = num[i];

            for (int j = 0; j < i; j++) {
                if (num[j] < num[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + num[i]);
                }
            }
        }

        int max = dp[0];

        for (int i = 1; i < n; i++) {
            max = Math.max(dp[i], max);
        }

        System.out.println(max);

    }

    private static int LIS(int n) {

        if (dp[n] == 0) {
            dp[n] = num[n];

            for (int i = n - 1; i >= 0; i--) {
                if (num[i] < num[n]) {
                    dp[n] = Math.max(dp[n], LIS(i) + num[n]);
                }
            }

        }

        return dp[n];
    }
}
