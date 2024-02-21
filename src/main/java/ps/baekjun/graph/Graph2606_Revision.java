package ps.baekjun.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Graph2606_Revision {

    private static int[][] graph;
    private static int V;
    private static int E;
    private static boolean[] visited;
    private static int count;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        V = Integer.parseInt(br.readLine());
        E = Integer.parseInt(br.readLine());

        graph = new int[V + 1][V + 1];
        visited = new boolean[V + 1];
        count = 0;
        StringTokenizer st;

        for (int i = 1; i < E + 1; i++) {
            st = new StringTokenizer(br.readLine());
            int node = Integer.parseInt(st.nextToken());
            int next = Integer.parseInt(st.nextToken());
            graph[node][next] = 1;
            graph[next][node] = 1;
        }

        dfs(1);

        System.out.println(count);

    }

    private static void dfs(int node) {
        visited[node] = true;
        for (int next = 1; next < graph[node].length; next++) {
            if (graph[node][next] == 1 && !visited[next]) {
                dfs(next);
                count++;
            }
        }

    }
}
