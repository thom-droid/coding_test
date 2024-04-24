package ps.baekjun.math;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Math9506 {

    public static void main(String[] args) {
        String word = " is NOT perfect.";

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int i = Integer.parseInt(readLine(bufferedReader));
            if (i == -1) {
                break;
            }

            int x = i - 1;
            StringBuilder sb = new StringBuilder().append(i).append(" = 1");
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    sb.append(" + ").append(j);
                    x -= j;
                }
            }

            if (x == 0) {
                System.out.println(sb);
            } else {
                System.out.println(i + word);
            }
        }

    }

    private static String readLine(BufferedReader bufferedReader) {
        try {
            return bufferedReader.readLine();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
