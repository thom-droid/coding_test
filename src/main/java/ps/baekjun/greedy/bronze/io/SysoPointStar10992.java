package ps.baekjun.greedy.bronze.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SysoPointStar10992 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n - 1; i++){

            // left space
            for(int l = n; l > i + 1; l--){
                System.out.print(" ");
            }

            // left star
            for(int ls = i; ls < i + 1; ls++){
                System.out.print("*");
            }

            // center space
            for(int c = 0; c < 2 * i - 1; c++){
                System.out.print(" ");
            }

            // right star
            if(i >= 1){
                for(int rs = i; rs < i + 1; rs++){
                    System.out.print("*");
                }
            }

            System.out.println("");
        }

        for(int i = 0; i < 2 * n - 1; i++){
            System.out.print("*");
        }

        

    }
}
