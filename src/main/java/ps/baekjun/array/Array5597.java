package ps.baekjun.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Array5597 {

    public static void main(String[] args) {
        boolean[] students = new boolean[30];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 28; i++) {
            students[Integer.parseInt(readLine(bufferedReader)) - 1] = true;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < students.length; i++) {
            if (!students[i]) sb.append(i + 1).append("\n");
        }
        System.out.println(sb.deleteCharAt(sb.length() - 1));
    }

    private static String readLine(BufferedReader bufferedReader) {
        try {
            return bufferedReader.readLine();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
