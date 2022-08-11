package ps.baekjun.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Backtracking15650 {

    static int N, M;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        N = Integer.parseInt(s[0]);
        M = Integer.parseInt(s[1]);

        boolean[] visited = new boolean[N];

        for (int i = 0; i < N; i++) {
            StringBuilder sb = new StringBuilder();
            visited[i] = true;
            sb.append(i + 1);
            backtracking(1, visited, sb);
            visited[i] = false;
        }
    }

    private static void backtracking(int depth, boolean[] visited, StringBuilder stringBuilder) {

        if (depth == M) {
            if (isInAscendingOrder(stringBuilder)) {
                prettyPrint(stringBuilder);
            }

            return ;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                stringBuilder.append(i + 1);
                backtracking(depth + 1, visited, stringBuilder);
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                visited[i] = false;
            }
        }
    }

    private static boolean isInAscendingOrder(StringBuilder sb) {

        for (int i = 0; i < sb.length() - 1; i++) {
            if (sb.charAt(i) > sb.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    private static void prettyPrint(StringBuilder sb) {
        StringBuilder printer = new StringBuilder(sb);
        for (int i = 0; i < M; i++) {
            printer.insert(2 * i + 1," ");
        }
        System.out.println(printer);
    }
}
