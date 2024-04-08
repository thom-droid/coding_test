package ps.baekjun.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Array3003 {
    public static void main(String[] args) throws IOException {
        int[] chess = {1, 1, 2, 2, 2, 8};
        int[] array = Arrays
                .stream(new BufferedReader(new InputStreamReader(System.in))
                        .readLine()
                        .split(" "))
                .mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < chess.length; i++) {
            array[i] = chess[i] - array[i];
        }

        Arrays.stream(array).forEach(i -> System.out.print(i + " "));
    }
}
