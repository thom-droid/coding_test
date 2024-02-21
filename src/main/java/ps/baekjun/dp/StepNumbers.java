package ps.baekjun.dp;
//Silver 1 , 10844

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StepNumbers {

    private static long[][] arr;
    private static final long MOD = 1000000000;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        arr = new long[n+1][10];
        long result = 0;

        dp(n);

        for(int i = 1; i <= 9; i++) {
//            result += memoization(n, i);
            result += arr[n][i];

        }

        System.out.println(result % MOD);

    }

    public static long memoization(int digit, int val){

        for(int i = 0; i <= 9; i++){
            arr[1][i] = 1;
        }

        if(digit == 1){
            return arr[digit][val];
        }

        if(arr[digit][val] == 0L){
            if(val == 0){
                arr[digit][val] = memoization(digit - 1, 1);
            } else if (val == 9){
                arr[digit][val] = memoization(digit - 1, 8);
            } else {
                arr[digit][val] = memoization(digit - 1, val - 1) + memoization(digit - 1, val + 1);

            }
        }
        return arr[digit][val] % MOD;
    }

    public static void dp(int n){

        for(int i = 0; i <= 9; i++){
            arr[1][i] = 1;
        }

        for(int i = 2; i <= n; i++){

            for(int j = 0; j <= 9; j++){

                if(j == 0){
                    arr[i][j] = arr[i - 1][1];
                } else if (j == 9){
                    arr[i][j] = arr[i - 1][8];
                } else {
                    arr[i][j] = arr[i -1][j - 1] + arr[i - 1][j + 1];
                }
            }
        }

    }

}
