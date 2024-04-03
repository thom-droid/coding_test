package ps.baekjun.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Array10810_2 {

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = readLine(bufferedReader).split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        int[] basket = new int[n];

        IntStream.range(0, m)
                .forEach(i -> {
                    String[] str = readLine(bufferedReader).split(" ");
                    int i1 = Integer.parseInt(str[0]);
                    int i2 = Integer.parseInt(str[1]);
                    int i3 = Integer.parseInt(str[2]);
                    IntStream.range(i1 - 1, i2)
                            .forEach(j -> basket[j] = i3);
                });

        StringBuilder stringBuilder = new StringBuilder();
        for (int i : basket) {
            stringBuilder.append(i).append(" ");
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        System.out.println(stringBuilder.toString());
    }

    private static String readLine(BufferedReader bufferedReader) {
        try {
            return bufferedReader.readLine();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
