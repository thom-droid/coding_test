package ps.baekjun.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Array10807 {

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(readLine(bufferedReader));
        String[] arr = readLine(bufferedReader).split(" ");
        int v = Integer.parseInt(readLine(bufferedReader));
        long count = Arrays.stream(arr).mapToInt(Integer::parseInt).filter(i -> i == v).count();
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
