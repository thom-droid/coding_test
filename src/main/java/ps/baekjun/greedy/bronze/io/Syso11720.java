package ps.baekjun.greedy.bronze.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Syso11720 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] strArr = br.readLine().split("");
        int sum = 0;

        for(int i = 0; i < strArr.length; i++){
            sum += Integer.parseInt(strArr[i]);
        }

        System.out.println(sum);

    }
}
