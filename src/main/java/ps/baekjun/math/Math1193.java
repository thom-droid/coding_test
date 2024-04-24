package ps.baekjun.math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Math1193 {
    public static void main(String[] args) {
        Integer n = Integer.parseInt(readLine(new BufferedReader(new InputStreamReader(System.in))));
        int i = 1;
        while (n > i) {
            n -= i;
            i++;
        }
        StringBuilder sb = new StringBuilder();

        // 1. i가 짝수인 경우
        if (i % 2 == 0) {
            sb.append(n).append("/").append(i - n + 1);
        } else {
            sb.append(i - n + 1).append("/").append(n);
        }

        System.out.println(sb);
    }
    private static String readLine(BufferedReader bufferedReader) {
        try {
            return bufferedReader.readLine();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
