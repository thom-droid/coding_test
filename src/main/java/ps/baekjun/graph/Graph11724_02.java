package ps.baekjun.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Graph11724_02 {

    private static boolean[] visited;
    private static Node[] nodes;
    private static int count;
    private static BufferedReader br;

    public static void main(String[] args) {

        br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);
        visited = new boolean[n + 1];
        nodes = new Node[n + 1];
        for (int i = 1; i <= n; i++) {
            nodes[i] = new Node(i );
        }

        for (int i = 0; i < m; i++) {
            split = readLine().split(" ");
            int a = Integer.parseInt(split[0]);
            int b = Integer.parseInt(split[1]);
            nodes[a].adjacent.add(nodes[b]);
            nodes[b].adjacent.add(nodes[a]);
        }

        for (int i = 1; i < n + 1; i++) {
            if (visited[i]) continue;
            Node node = nodes[i];
            dfs(node);
            count++;
        }

        System.out.println(count);
    }

    public static void dfs(Node node) {
        if (visited[node.data]) return;
        visited[node.data] = true;
        for (Node next : node.adjacent) {
            dfs(next);
        }
    }

    public static class Node {
        int data;
        List<Node> adjacent = new ArrayList<>();

        public Node(int data) {
            this.data = data;
        }

        public void addAdjacent(Node node) {
            adjacent.add(node);
        }
    }

    public static String readLine() {
        try {
            return br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        throw new IllegalArgumentException("no input.");
    }
}
