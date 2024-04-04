package ps.baekjun.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

import static java.nio.file.Files.lines;

public class Array3052_03 {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        long count = IntStream.range(0, 10)
                .mapToObj(i -> Integer.parseInt(readLine(bufferedReader)) % 42)
                .distinct()
                .count();
        System.out.println(count);
    }

    private static String readLine(BufferedReader bufferedReader) {
        try {
            return bufferedReader.readLine();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
