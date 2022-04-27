package ps.baekjun.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//silver 3 2193
public class PinaryNumber {

    private static Long[][] dp;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        dp = new Long[n+1][2];
        dp[1][0] = 0L;
        dp[1][1] = 1L;

//        int result = 0;
        for(int i = 0; i <=1; i++){
//            result += memoization(n, i);
        }

//        System.out.println(result);
        System.out.println(bottomUp(n));
    }

    public static long memoization(int digit, int val){
        if(digit == 1L){
            return dp[digit][val];
        }

        if(dp[digit][val] == null){

            if(val == 1){
                dp[digit][val] = memoization(digit - 1, 0);
            } else if(val == 0){
                dp[digit][val] = memoization(digit - 1, 1) + memoization(digit - 1, 0);
            }
        }

        return dp[digit][val];
    }

    public static long bottomUp(int n){


        for(int i = 2; i <= n; i++){

            dp[i][1] = dp[i-1][0];
            dp[i][0] = dp[i-1][0] + dp[i-1][1];

        }

        return dp[n][0] + dp[n][1];
    }
}
