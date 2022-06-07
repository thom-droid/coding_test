package ps.baekjun.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Graph1260 {
    private static boolean[] isVisited;
    private static StringBuilder sb = new StringBuilder();

    private static void bfs(int N, int V, int[][] matrix) {

        LinkedList<Integer> queue = new LinkedList<>();
        isVisited = new boolean[N + 1];

        // 총 N회 순회하게 되므로 크기에 맞게 결과 배열 선언
//        ArrayList<Integer> result = new ArrayList<>(N + 1);

        // 시작점은 먼저 입력함
        queue.add(V);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            sb.append(node).append(" ");
            isVisited[node] = true;

            for (int next = 1; next <= N; next++) {

                if (!isVisited[next] && matrix[node][next] == 1) {
                    queue.add(next);
                    isVisited[next] = true;
                }
            }
        }

    }

    private static void dfs(int N, int V, int[][] matrix) {
        sb.append(V).append(" ");
        isVisited[V] = true;
        for (int next = 1; next <= N; next++) {
            if (!isVisited[next] && matrix[V][next] == 1) {
                isVisited[next] = true;
                dfs(N, next, matrix);
            }
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        int[][] matrix = new int[N + 1][N + 1];

        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int y = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            matrix[y][x] = 1;
            matrix[x][y] = 1;
        }

//        ArrayList<Integer> result = bfs(N, V, matrix);
//        System.out.println(Arrays.toString(result.toArray()));
        isVisited = new boolean[N + 1];
        dfs(N, V, matrix);
        sb.deleteCharAt(sb.length() - 1).append('\n');
        bfs(N, V, matrix);
        sb.deleteCharAt(sb.length() - 1);

        System.out.println(sb.toString());
    }
}
