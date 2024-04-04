package ps.baekjun.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Array10811_02 {

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(readLine(bufferedReader), " ");
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());

        Integer[] array = IntStream.range(0, n)
                .mapToObj(i -> i + 1)
                .toArray(Integer[]::new);
        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(readLine(bufferedReader));
            int i1 = Integer.parseInt(st.nextToken());
            int i2 = Integer.parseInt(st.nextToken());

            for (int j = i1; j < i1 + (i2 - i1 + 1) / 2; j++) {
                int temp = array[j - 1];
                array[j - 1] = array[i2 - j + i1 - 1];
                array[i2 - j + i1 - 1] = temp;
            }

            // 1 2 3 4 5 6 7 8 9 10
            // 0 1 2 3 4 5 6 7 8 9
        }
        int st = 0;
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
