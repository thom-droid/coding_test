package ps.baekjun.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//silver 3
public class CombinationOfNumbers {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            int k = Integer.parseInt(br.readLine());
            arr[i] = memoization(k);
        }

        for(int result: arr){
            System.out.println(result);
        }
        //        System.out.println(memoization(n));
//        System.out.println(bottomUp(n));
    }

    public static int memoization(int n){

        int[] cache = new int[n+3];
        cache[0] = 0;
        cache[1] = 1;
        cache[2] = 2;
        cache[3] = 4;

        if(n < 0){
            return -1;
        } else if( n == 0 || n == 1 || n == 2 || n == 3){
            return cache[n];
        } else if( cache[n] == 0) {
            cache[n] = memoization(n - 3) + memoization(n - 2) + memoization(n - 1);
        }
        return cache[n];
    }

    public static int bottomUp(int n){

        int[] cache = new int[n+3];
        cache[0] = 0;
        cache[1] = 1;
        cache[2] = 2;
        cache[3] = 4;

        if(n < 0){
            return -1;
        } else if( n == 0 || n == 1 || n == 2 || n == 3) {
            return cache[n];
        }

        for(int i = 4; i <= n;i++){
            cache[i] = cache[i - 3] + cache[i - 2] + cache[i - 1];
        }
        return cache[n];
    }

}
