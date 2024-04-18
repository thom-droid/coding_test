package ps.baekjun.math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Math2745 {

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] split = readLine(bufferedReader).split(" ");
        int result = 0;
        String n = split[0];
        int b = Integer.parseInt(split[1]);
        for (int i = 0; i < n.length(); i++) {
            char c = n.charAt(i);
            double pow = Math.pow(b, n.length() - i - 1);
            int i2;
            if (c >= 'A' && c <= 'Z') {
                i2 = c - 'A' + 10;
            } else {
                i2 = c - '0';
            }
            result += i2 * pow;
        }
        System.out.println(result);
    }

    private static String readLine(BufferedReader bufferedReader) {
        try {
            return bufferedReader.readLine();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
