package ps.baekjun.graph.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Graph10451 {
    private static boolean[] isVisited;
    private static int[][] matrix;

    private static void dfs(int vertex){

        isVisited[vertex] = true;
        int next = matrix[vertex][1];

        if(!isVisited[next]){
            dfs(next);
        }
    }

    private static int solve(BufferedReader br) throws IOException {
        int V = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        matrix = new int[V + 1][2];
        isVisited = new boolean[V + 1];

        int count = 0;

        for (int i = 1; i < matrix.length; i++) {
            matrix[i][0] = i;
            matrix[i][1] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i < isVisited.length; i++) {
            if (!isVisited[i]) {
                count++;
                dfs(i);
            }
        }

        return count;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            sb.append(solve(br)).append('\n');
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }

}
