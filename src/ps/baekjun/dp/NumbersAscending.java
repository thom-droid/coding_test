package ps.baekjun.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//11057 silver 1
public class NumbersAscending {

    private static final long MOD = 10007;
    private static int[][] arr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        arr = new int[n+1][10];

        for(int i = 0; i <= 9; i++){
            arr[1][i] = 1;
        }

        System.out.println(dp(n));
    }

    public static long dp(int n){

        for(int i = 2; i <= n; i++){

            for (int j = 0; j <= 9; j++){

                for(int k = 0; k <=j; k++){

                    arr[i][j] += arr[i - 1][k];
                }
                arr[i][j] %= MOD;
            }
        }

        int result = 0;

        for(int i = 0; i <=9; i++){
            result += arr[n][i];
        }

        return result % MOD;
    }

}
