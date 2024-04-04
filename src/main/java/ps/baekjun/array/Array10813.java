package ps.baekjun.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Array10813 {

    public static void main(String[] args) {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(readLine(bufferedReader), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] baskets = new int[n];
        for (int i = 0; i < n; i++) {
            baskets[i] = i + 1;
        }

        for (int i = 0; i < m; i++) {
            StringTokenizer st2 = new StringTokenizer(readLine(bufferedReader), " ");
            int i1 = Integer.parseInt(st2.nextToken());
            int i2 = Integer.parseInt(st2.nextToken());
            int temp = baskets[i1 - 1];
            baskets[i1 - 1] = baskets[i2 - 1];
            baskets[i2 - 1] = temp;
        }

        StringBuilder stringBuilder = new StringBuilder();
        IntStream.range(0, n)
                .forEach(i -> stringBuilder.append(baskets[i]).append(" "));
        System.out.println(stringBuilder.deleteCharAt(stringBuilder.length() - 1).toString());
    }

    private static String readLine(BufferedReader bufferedReader) {
        try {
            return bufferedReader.readLine();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
