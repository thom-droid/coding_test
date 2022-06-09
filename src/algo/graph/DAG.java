package algo.graph;

import java.util.ArrayDeque;
import java.util.Arrays;

public class DAG {

    private static int[][] graph;
    private static boolean[] isVisited;
    private static ArrayDeque<Integer> queue = new ArrayDeque<>();

    private static void orderTopologically(int[][] graph) {
        isVisited = new boolean[graph.length];
        DAG.graph = graph;

        for (int i = 1; i < isVisited.length; i++) {
            if (!isVisited[i]) {
                dfs_ts(i);
            }
        }
    }

    private static void dfs_ts(int vertex) {
        isVisited[vertex] = true;

        for (int next = 1; next < graph.length; next++) {
            if (!isVisited[next] && graph[vertex][next] == 1) {
                dfs_ts(next);
            }
        }

        queue.addFirst(vertex);

    }

    private static void print() {
        System.out.println(Arrays.toString(queue.toArray()));
    }

    public static void main(String[] args) {
        int[][] graph = new int[][]{
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 1, 0},
                {0, 0, 0, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 0}
        };

        orderTopologically(graph);
        print();
    }
}
