package ps.baekjun.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// silver 3
public class WaysToFillRectangle2 {

    private static int[] cache;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        cache = new int[n +2 ];
        cache[0] = 0;
        cache[1] = 1;
        cache[2] = 3;
        System.out.println(memoization(n));
        System.out.println(Arrays.toString(cache));
//
//        System.out.println(bottomUp(n));
//        System.out.println(Arrays.toString(cache));
    }

    public static int memoization(int n){

        if(n < 0){
            return -1;
        } else if(n == 1 || n == 2){
            return cache[n];
        } else if(cache[n] == 0){
            cache[n] = (memoization(n - 1) + 2 * memoization(n - 2)) % 10007;
        }
        return cache[n];
    }

    public static int bottomUp(int n){
        if(n < 0){
            return -1;
        } else if(n == 1 || n == 2) {
            return cache[n];
        }

        for(int i = 3; i <= n; i++){
            cache[i] = ((cache[i - 1]) + 2 * cache[i - 2]) % 10007;
        }

        return cache[n];
    }
}
