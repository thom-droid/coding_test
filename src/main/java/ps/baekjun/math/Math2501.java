package ps.baekjun.math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Math2501 {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] split = readLine(bufferedReader).split(" ");
        int n = Integer.parseInt(split[0]);
        int k = Integer.parseInt(split[1]);
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                k--;
                if (k == 0) {
                    System.out.println(i);
                    return;
                }
            }
        }
        System.out.println(0);
    }

    private static String readLine(BufferedReader bufferedReader) {
        try {
            return bufferedReader.readLine();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
