package ps.baekjun.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static ps.baekjun.graph.Graph1012.readLine;

public class IO15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int sum = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).sum();
            sb.append(sum).append("\n");
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);

    }

}
