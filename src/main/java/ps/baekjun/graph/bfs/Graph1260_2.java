package ps.baekjun.graph.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Graph1260_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);
        int v = Integer.parseInt(split[2]);

        graph = new Graph(n);
        for (int i = 0; i < m; i++) {
            String[] edge = br.readLine().split(" ");
            int node1 = Integer.parseInt(edge[0]);
            int node2 = Integer.parseInt(edge[1]);
            graph.addEdge(node1, node2);
        }
        graph.sortEdge();

        System.out.println("====== DFS ======");
        Node node = graph.getNode(v);
        StringBuilder sb = dfsRecursive(node, new StringBuilder());
        sb.deleteCharAt(sb.length() - 1); // remove last space
        System.out.println(sb);
//        dfs(v);
        resetGraph();

        System.out.println("====== BFS ======");
        bfs(v);
    }

    private static void resetGraph() {
        for (int i = 1; i < graph.nodes.length; i++) {
            graph.nodes[i].marked = false;
        }
    }

    private static Graph graph;

    public static class Graph {
        private final Node[] nodes;

        public Graph(int size) {
            this.nodes = new Node[size + 1];
            for (int i = 1; i < size + 1; i++) {
                this.nodes[i] = new Node(i);
            }
        }

        public void addEdge(int node1Index, int node2Index) {
            Node node1 = this.nodes[node1Index];
            Node node2 = this.nodes[node2Index];
            if (!node1.getAdjacent().contains(node2)) {
                node1.getAdjacent().add(node2);
            }
            if (!node2.getAdjacent().contains(node1)) {
                node2.getAdjacent().add(node1);
            }
        }

        public Node getNode(int index) {
            return this.nodes[index];
        }

        public void sortEdge() {
            for (int i = 1; i < nodes.length; i++) {
                nodes[i].getAdjacent().sort(Comparator.comparingInt(Node::getData));
            }
        }
    }

    public static class Node {
        private int data;
        private boolean marked;
        private final List<Node> adjacent;

        public Node(int data) {
            this.data = data;
            this.marked = false;
            this.adjacent = new LinkedList<>();
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public boolean isNotVisited() {
            return !marked;
        }

        public void visit() {
            this.marked = true;
        }

        public List<Node> getAdjacent() {
            return adjacent;
        }
    }

    public static void dfs(int index) {
        StringBuffer sb = new StringBuffer();
        Node root = graph.getNode(index);
        LinkedList<Node> stack = new LinkedList<>();
        root.visit();
        sb.append(root.getData());
        stack.push(root);

        while (!stack.isEmpty()) {
            Node node = stack.pop();
            for (Node next : node.getAdjacent()) {
                if (next.isNotVisited()) {
                    next.visit();
                    sb.append(" ").append(next.getData());
                    stack.push(next);
                }
            }
        }
        System.out.println(sb);
    }

    public static StringBuilder dfsRecursive(Node node, StringBuilder sb) {
        if (node == null) return sb;
        node.visit();
        sb.append(node.getData()).append(" ");
        for (Node next : node.getAdjacent()) {
            if (next.isNotVisited()) {
                return dfsRecursive(next, sb);
            }
        }
        return sb;
    }

    public static void bfs(int index) {
        StringBuffer sb = new StringBuffer();
        Node root = graph.getNode(index);
        LinkedList<Node> queue = new LinkedList<>();
        root.visit();
        sb.append(root.getData());
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            for (Node next : node.getAdjacent()) {
                if (next.isNotVisited()) {
                    next.visit();
                    sb.append(" ").append(next.getData());
                    queue.offer(next);
                }
            }
        }
        System.out.println(sb);
    }
}
