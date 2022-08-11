package ps.baekjun.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Backtracking15649 {
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        N = Integer.parseInt(s[0]);
        M = Integer.parseInt(s[1]);
        StringBuilder sb;
        boolean[] visited = new boolean[N];
        for (int i = 0; i < N; i++) {
            visited[i] = true;
            sb = new StringBuilder();
            sb.append(i + 1).append(" ");
            backtracking(1, visited, sb);
            visited[i] = false;
        }


    }

    private static void backtracking(int level, boolean[] visited, StringBuilder sb) {

        if (level == M) {
            System.out.println(sb);
            return ;
        }

        for (int j = 0; j < N; j++) {
            if (!visited[j]) {
                visited[j] = true;
                sb.append(j + 1).append(" ");
                backtracking(level + 1, visited, sb);
                sb.deleteCharAt(sb.length() - 1);
                sb.deleteCharAt(sb.length() - 1);
                visited[j] = false;
            }
        }


    }

}
