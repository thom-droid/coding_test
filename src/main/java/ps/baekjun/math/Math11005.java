package ps.baekjun.math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Math11005 {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] split = readLine(bufferedReader).split(" ");
        int result = 0;
        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[1]);

        StringBuilder sb = new StringBuilder();
        while (a > 0) {
            int mod = a % b;
            if (mod >= 10) {
                sb.append((char) (mod - 10 + 'A'));
            } else {
                sb.append(mod);
            }
            a /= b;
        }

        StringBuilder reverse = sb.reverse();
        System.out.println(reverse);
    }

    private static String readLine(BufferedReader bufferedReader) {
        try {
            return bufferedReader.readLine();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

