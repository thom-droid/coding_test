package ps.baekjun.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LIS11722 {

    private static int[] dp;
    private static int[] seq;
    private static int size;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp = new int[n];
        seq = new int[n];
        size = n;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            LIS(i);
        }

        int max = dp[0];

        for(int i: dp) max = Math.max(i, max);

        System.out.println(max);

    }

    private static int LIS(int n) {

        if (dp[n] == 0) {
            dp[n] = 1;

            for (int i = n; i < size; i++) {
                if (seq[n] > seq[i]) {
                    dp[n] = Math.max(dp[n], LIS(i) + 1);
                }
            }
        }

        return dp[n];
    }

}
