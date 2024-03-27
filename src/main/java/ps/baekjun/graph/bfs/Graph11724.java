package ps.baekjun.graph.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

//Connected Component, Silver 3
public class Graph11724 {

    static int[][] graph;
    static boolean[] visited;
    static int count;

    private static void dfs(int v) {

        visited[v] = true;

        for (int e = 1; e < graph[v].length; e++) {
            if (graph[v][e] == 1 && !visited[e]) {
                dfs(e);
            }
        }
    }

    private static void solution() {
        for (int v = 1; v < visited.length; v++) {
            if (!visited[v]) {
                dfs(v);
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        graph = new int[V + 1][V + 1];
        visited = new boolean[V + 1];

        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());

            graph[from][to] = 1;
            graph[to][from] = 1;

        }

        solution();
    }

}
