package ps.baekjun.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Array2738 {

    public static void main(String[] args) {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = readLine(bufferedReader).split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int m = Integer.parseInt(firstLine[1]);
        int[][] array = new int[n][m];

        for (int i = 0; i < n * 2; i++) {
            String[] s = readLine(bufferedReader).split(" ");
            for (int j = 0; j < m; j++) {
                if (i < n) {
                    array[i][j] = Integer.parseInt(s[j]);
                } else {
                    array[i -n][j] += Integer.parseInt(s[j]);
                }
            }
        }

        Arrays.stream(array).forEach(ints -> {
            Arrays.stream(ints).forEach(i -> System.out.print(i + " "));
            System.out.println();
        });
    }

    private static String readLine(BufferedReader bufferedReader) {
        try {
            return bufferedReader.readLine();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
