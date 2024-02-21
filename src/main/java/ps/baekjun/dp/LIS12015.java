package ps.baekjun.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LIS12015 {

    private static int[] dp;
    private static int[] seq;
    private static int lastIndex;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        dp = new int[n];
        seq = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }

        dp[0] = seq[0];
        int lastIndex = 1;

        for (int i = 1; i < n; i++) {

            int value = seq[i];

            if (value > dp[lastIndex - 1]) {
                lastIndex++;
                dp[lastIndex - 1] = value;
            }
            else {

                int low = 0;
                int high = lastIndex;

                while (low < high) {

                    int mid = (low + high) / 2;

                    if (value < dp[mid]) {
                        high = mid;
                    } else {
                        low = mid + 1;
                    }

                }

                dp[low] = value;
            }
        }

        System.out.println(lastIndex);

    }

}


