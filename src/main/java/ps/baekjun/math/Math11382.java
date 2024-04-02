package ps.baekjun.math;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Math11382 {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        long sum = Arrays.stream(readline(bufferedReader).split(" ")).mapToLong(Long::parseLong).sum();
        System.out.println(sum);
    }

    private static String readline(BufferedReader bufferedReader) {
        try {
            return bufferedReader.readLine();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
