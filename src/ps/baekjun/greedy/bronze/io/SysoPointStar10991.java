package ps.baekjun.greedy.bronze.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SysoPointStar10991 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){

            // left space
            for(int l = n; l > i + 1; l--){
                System.out.print(" ");
            }
            // star

            for(int s = 0; s < i + 1; s++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println("");
        }

    }
}
