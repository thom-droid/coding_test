package ps.baekjun.greedy.bronze.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SysoPointStar2445 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < 2 * n -1; i++){

            // reversion point
            if(i >= n){

                for(int l = 0; l < 2 * n - i - 1; l++){
                    System.out.print("*");
                }

                for(int c = 2 * i; c > 2 * n - 2; c--){
                    System.out.print(" ");
                }

                for(int r = 0; r < 2 * n - i - 1; r++){
                    System.out.print("*");
                }

            } else {
                // left dot
                for(int l = 0; l < i + 1; l++){
                    System.out.print("*");
                }

                // center
                for(int c = 2 * i; c < 2 * n - 2; c++){
                    System.out.print(" ");
                }

                // right dot
                for(int r = 0; r < i + 1; r++){
                    System.out.print("*");
                }
            }

            System.out.println("");
        }
    }
}
