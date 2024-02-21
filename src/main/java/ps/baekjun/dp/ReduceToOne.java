package ps.baekjun.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Silver 3
public class ReduceToOne {

    private static int[] cache;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        cache = new int[n+1];
        cache[0] = cache[1] = 0;

        System.out.println(countMin(n));
    }

    public static int countMin(int n){

        if(n == 1){
            return cache[n];
        }

        if(cache[n] == 0){

            if(n % 6 == 0){
                cache[n] = Math.min(countMin(n - 1), Math.min(countMin(n / 3), countMin(n / 2))) + 1;
            }
            else if (n % 3 == 0){
                cache[n] = Math.min(countMin(n / 3), countMin(n - 1)) + 1;
            }
            else if (n % 2 == 0){
                cache[n] = Math.min(countMin(n / 2), countMin(n - 1)) + 1;
            }
            else {
                cache[n] = countMin(n -1) + 1;
            }
        }

        return cache[n];
    }
}
