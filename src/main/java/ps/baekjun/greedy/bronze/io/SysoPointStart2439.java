package ps.baekjun.greedy.bronze.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SysoPointStart2439 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 1; i < n + 1; i++){
            for(int j = 0; j < n - i; j++){
                System.out.print(" ");
            }

            for(int k = n; k > n - i; k--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
