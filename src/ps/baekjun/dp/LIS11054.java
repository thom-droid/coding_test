package ps.baekjun.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LIS11054 {

    private static int[] dp1;
    private static int[] dp2;
    private static int[] seq;
    private static int size;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp1 = new int[n];
        dp2 = new int[n];
        seq = new int[n];
        size = n;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {

            LIS_ascending(i);
            LIS_descending(i);

        }

        for (int i = 0; i < n; i++) {
            dp1[i] = dp1[i] + dp2[i] - 1;
        }

        int max = dp1[0];
        for(int i : dp1) max = Math.max(max, i);

        System.out.println(max);
    }

    private static int LIS_ascending(int n) {

        if (dp1[n] == 0) {
            dp1[n] = 1;

            for (int i = n - 1; i >= 0; i--) {
                if (seq[i] < seq[n]) {
                    dp1[n] = Math.max(dp1[n], LIS_ascending(i) + 1);
                }
            }

        }

        return dp1[n];
    }

    private static int LIS_descending(int n) {

        if (dp2[n] == 0) {
            dp2[n] = 1;

            for (int i = n + 1; i < size; i++) {

                if (seq[i] < seq[n]) {
                    dp2[n] = Math.max(dp2[n], LIS_descending(i) + 1);
                }
            }
        }

        return dp2[n];
    }

}
