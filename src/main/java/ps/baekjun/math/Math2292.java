package ps.baekjun.math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Math2292 {

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(readLine(bufferedReader));

        int[] ints = new int[20000];

        ints[1] = 1;
        ints[2] = 7;
        ints[3] = 19;
        for (int j = 4; j < ints.length; j++) {
            ints[j] = ints[j - 1] + 6 * (j - 1);
        }

        int result = 1;
        for (int j = 1; j < ints.length; j++) {
            if (i <= ints[j]) {
                result = j;
                break;
            }
        }

        System.out.println(result);
    }

    private static String readLine(BufferedReader bufferedReader) {
        try {
            return bufferedReader.readLine();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
