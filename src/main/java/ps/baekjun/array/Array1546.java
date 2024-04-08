package ps.baekjun.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Array1546 {

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(readLine(bufferedReader));
        String s = readLine(bufferedReader);
        Supplier<IntStream> intStream = () -> Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt);
        int max = intStream.get().max().getAsInt();
        int[] array = intStream.get().toArray();
        double average = (double) Arrays.stream(array).sum() / max / n;
        System.out.println(average * 100);
    }

    private static String readLine(BufferedReader bufferedReader) {
        try {
            return bufferedReader.readLine();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
