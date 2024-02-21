package ps.baekjun.recursion;

import java.io.*;
import java.util.Scanner;

// silver 3, 1003
public class FibonacciNumbers {

    private static Integer[][] dp = new Integer[41][2];

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int[] cases = new int[T];

        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;

        StringBuilder sb = new StringBuilder();

        while(T-- > 0){
            int N = sc.nextInt();
            fibonacci(N);
            sb.append(dp[N][0]).append(" ").append(dp[N][1]).append('\n');
        }

        System.out.println(sb);

    }

    public static Integer[] fibonacci(int number) {

        if (dp[number][0] == null || dp[number][1] == null){
            dp[number][0] = fibonacci(number - 2)[0] + fibonacci(number - 1)[0];
            dp[number][1] = fibonacci(number - 2)[1] + fibonacci(number - 1)[1];
        }

        return dp[number];
    }

}

