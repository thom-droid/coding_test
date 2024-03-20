package ps.baekjun.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Graph2606_2 {

    public static void main(String[] args) {
        int result = new Graph().bfs(1).getResult();
        System.out.println(result);
    }

    public static class Graph {
        private final BufferedReader br;
        private int n;
        private int m;
        private Node[] nodes;
        private int count = 0;
        private final LinkedList<Node> queue = new LinkedList<>();

        public Graph() {
            this.br = new BufferedReader(new InputStreamReader(System.in));
            initLine();
            initNode();
            initEdge();
        }

        private void initNode() {
            nodes = new Node[n + 1];
            for (int i = 1; i < n + 1; i++) {
                nodes[i] = new Node(i);
            }
        }

        private void initEdge() {
            for (int i = 0; i < m; i++) {
                String[] split = readLine().split(" ");
                int n1 = Integer.parseInt(split[0]);
                int n2 = Integer.parseInt(split[1]);
                addEdge(n1, n2);
            }
        }

        private void initLine() {
            n = Integer.parseInt(readLine());
            m = Integer.parseInt(readLine());
        }

        public Graph bfs(int index) {
            Node start = getNode(1);
            offerNode(start);
            while (!queue.isEmpty()) {
                Node next = queue.poll();
                for (Node node : next.adjacent) {
                    if (node.isNotVisited()) {
                        offerNode(node);
                    }
                }
            }
            return this;
        }

        public int getResult() {
            return count - 1;
        }

        private void addEdge(int n1, int n2) {
            Node node1 = nodes[n1];
            Node node2 = nodes[n2];
            if (!node1.adjacent.contains(node2)) {
                node1.adjacent.add(node2);
            }
            if (!node2.adjacent.contains(node1)) {
                node2.adjacent.add(node1);
            }
        }

        private String readLine() {
            try {
                return br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            throw new IllegalArgumentException("no input.");
        }

        private Node getNode(int index) {
            return nodes[index];
        }

        private void addCount() {
            this.count++;
        }

        private void offerNode(Node node) {
            queue.offer(node);
            node.mark();
            addCount();
        }
    }

    public static class Node {
        private final int data;
        private boolean visited;
        private final List<Node> adjacent = new LinkedList<>();

        public Node(int data) {
            this.data = data;
        }

        public void mark() {this.visited = true;}
        public boolean isNotVisited() {return !visited;}

    }
}
