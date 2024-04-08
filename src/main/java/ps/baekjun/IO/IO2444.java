package ps.baekjun.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO2444 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 2 * n - 1; i++) {
            int star = i < n ? i + 1 : 2 * n - i - 1;
            int empty = n - star;
            star = star * 2 - 1;
            stringBuilder.append(" ".repeat(Math.max(0, empty)));

            stringBuilder.append("*".repeat(Math.max(0, star)));

            stringBuilder.append("\n");
        }

        System.out.println(stringBuilder.deleteCharAt(stringBuilder.length() - 1).toString());
    }
}
