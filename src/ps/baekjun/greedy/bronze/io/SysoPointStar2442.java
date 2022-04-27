package ps.baekjun.greedy.bronze.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SysoPointStar2442 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){

            // left white space. n - 1 , n - 2, n -3, ...
            for(int l = n - 1; l > i; l--){
                System.out.print(" ");
            }

            // center star
            for(int c = 0; c < (2 * i) + 1; c++){
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}
