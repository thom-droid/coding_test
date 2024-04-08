package ps.baekjun.literals;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class String9086 {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(readLine(bufferedReader));
        IntStream.range(0, n).forEach(i -> {
            String s = readLine(bufferedReader);
            System.out.println(s.charAt(0) + "" + s.charAt(s.length() - 1));
        });
    }

    private static String readLine(BufferedReader bufferedReader) {
        try {
            return bufferedReader.readLine();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
