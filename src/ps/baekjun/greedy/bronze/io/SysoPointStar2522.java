package ps.baekjun.greedy.bronze.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SysoPointStar2522 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < 2 * n -1; i++){

            if(i >= n){
                for(int l = i + 1; l > n; l--){
                    System.out.print(" ");
                }

                for(int s = i + 1; s < 2 * n; s++){
                    System.out.print("*");
                }
            } else {
                // left white space
                for(int l = n - 1; l > i; l--){
                    System.out.print(" ");
                }

                // star
                for(int s = 0; s < i + 1; s++){
                    System.out.print("*");
                }
            }

            System.out.println("");
        }
    }
}
