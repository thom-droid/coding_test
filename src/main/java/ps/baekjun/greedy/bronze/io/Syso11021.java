package ps.baekjun.greedy.bronze.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Syso11021 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            int num = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sum();
            System.out.println("Case #"+(i+1)+": "+num);
        }

        br.close();
        System.exit(0);

    }
}
