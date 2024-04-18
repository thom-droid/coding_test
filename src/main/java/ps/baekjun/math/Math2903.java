package ps.baekjun.math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Math2903 {

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(readLine(bufferedReader));
        int c = 2;
        for (int j = 0; j < i; j++) {
            c += c - 1;
        }
        System.out.println(c * c);
    }

    private static String readLine(BufferedReader bufferedReader) {
        try {
            return bufferedReader.readLine();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
