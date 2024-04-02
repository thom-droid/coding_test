package ps.baekjun.iteration;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Iter25304 {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String readline = readline(bufferedReader);
        long total = Long.parseLong(readline);
        int count = Integer.parseInt(readline(bufferedReader));

        for (int i = 0; i < count; i++) {
            String line = readline(bufferedReader);
            long asLong = Arrays.stream(line.split(" ")).mapToLong(Long::parseLong).reduce(1, (a, b) -> a * b);
            total -= asLong;
        }

        System.out.println(total == 0 ? "Yes" : "No");
    }

    private static String readline(BufferedReader bufferedReader) {
        try {
            return bufferedReader.readLine();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
