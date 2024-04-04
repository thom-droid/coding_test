package ps.baekjun.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

import static java.util.Collections.reverse;

public class Array10811 {

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(readLine(bufferedReader), " ");
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());

        Integer[] array = IntStream.range(0, n)
                .mapToObj(i -> i + 1)
                .toArray(Integer[]::new);

        IntStream.range(0, m)
                .forEach(i -> {
                    StringTokenizer stringTokenizer2 = new StringTokenizer(readLine(bufferedReader), " ");
                    int i1 = Integer.parseInt(stringTokenizer2.nextToken());
                    int i2 = Integer.parseInt(stringTokenizer2.nextToken());
                    reverse(Arrays.asList(array).subList(i1 - 1, i2));
                });

        Arrays.stream(array).forEach(i -> System.out.print(i + " "));
    }

    private static String readLine(BufferedReader bufferedReader) {
        try {
            return bufferedReader.readLine();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
