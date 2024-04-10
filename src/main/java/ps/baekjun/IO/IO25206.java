package ps.baekjun.IO;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IO25206 {

    public static void main(String[] args) {

        Map<String, Float> grades =
                Map.of("A+", 4.5f,
                        "A0", 4.0f,
                        "B+", 3.5f,
                        "B0", 3.0f,
                        "C+", 2.5f,
                        "C0", 2.0f,
                        "D+", 1.5f,
                        "D0", 1.0f,
                        "F", 0.0f
                );

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Supplier<Stream<String[]>> supplier = () -> IntStream.rangeClosed(1, 20)
                .mapToObj(i -> readLine(bufferedReader).split(" "))
                .filter(arr -> !"P".equals(arr[2]));

        double sum = supplier.get().mapToDouble(arr -> grades.get(arr[2]) * Float.parseFloat(arr[1])).sum();
        double sum1 = supplier.get().mapToDouble(arr -> Float.parseFloat(arr[1])).sum();

        System.out.println(sum / sum1);
    }

    private static String readLine(BufferedReader bufferedReader) {
        try {
            return bufferedReader.readLine();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
