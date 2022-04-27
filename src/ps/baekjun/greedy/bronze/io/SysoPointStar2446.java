package ps.baekjun.greedy.bronze.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SysoPointStar2446 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < 2 * n - 1; i++){

            if(i > n - 1){
                for(int l = i; l < 2 * n - 2; l++){
                    System.out.print(" ");
                }

                for(int s = 2 * i + 1; s > 2 * n - 2; s--){
                    System.out.print("*");
                }
            } else {

                // left white space
                for(int l = 0; l < i; l++){
                    System.out.print(" ");
                }

                // star
                for(int s = 2 * i; s < 2 * n - 1; s++){
                    System.out.print("*");
                }

            }
            System.out.println("");
        }
    }
}
