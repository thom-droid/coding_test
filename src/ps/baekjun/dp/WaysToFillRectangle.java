package ps.baekjun.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Silver 3
public class WaysToFillRectangle {

    private static int[] cache;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        cache = new int[n + 2];
        cache[1] = 1;
        cache[2] = 2;

        System.out.println(recursion(n));
    }

    public static int recursion(int n){

        if(n <= 0){
            return -1;
        }

        if(n == 1 || n == 2){
            return cache[n];
        }

        for(int i = 3; i <= n; i++){
            cache[i] = (cache[i - 2] + cache[i - 1]) % 10007;
        }

        return cache[n];
    }

}
