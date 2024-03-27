package ps.baekjun.graph.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Graph2606 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int V = Integer.parseInt(br.readLine());
        int E = Integer.parseInt(br.readLine());

        int[][] graph = new int[V + 1][V + 1];

        StringTokenizer st;

        for (int i = 1; i < E + 1; i++) {
            st = new StringTokenizer(br.readLine());
            int node = Integer.parseInt(st.nextToken());
            int next = Integer.parseInt(st.nextToken());
            graph[node][next] = 1;
            graph[next][node] = 1;
        }

        if (V == 1) {
            System.out.println(0);
            return;
        }

        LinkedList<Integer> queue = new LinkedList<>();

        boolean[] visited = new boolean[V + 1];

        queue.push(1);
        int count = 0;

        while (queue.size() != 0) {
            int vertex = queue.poll();
            visited[vertex] = true;

            for (int next = 1; next < graph[vertex].length; next++) {
                if (graph[vertex][next] == 1 && !visited[next]) {
                    queue.push(next);
                    visited[next] = true;
                    count++;
                }
            }
        }
        System.out.println(count);
    }

}
