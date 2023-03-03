package ds;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Graph <T> {

    private final List<Node<T>> nodes = new ArrayList<>();

    public void addNode(Node<T> node) {
        this.nodes.add(node);
    }

    public void addNode(List<Node<T>> nodes) {
        this.nodes.addAll(nodes);
    }

    public void addEdge(Node<T> e1, Node<T> e2) {
        if (!e1.adjacent.contains(e2)) {
            e1.addEdge(e2);
        }

        if (!e2.adjacent.contains(e1)) {
            e2.addEdge(e1);
        }
    }

    public void dfs(int startIndex) {
        checkIndex(startIndex);

        Node<T> first = nodes.get(startIndex);
        Stack<Node<T>> stack = new Stack<>();
        stack.push(first);

        while (!stack.isEmpty()) {

            Node<T> n = stack.pop();

            n.printNode();

            List<Node<T>> list = n.adjacent;

            for (Node<T> tNode : list) {
                if (!tNode.visited) {
                    tNode.markVisited();
                    stack.push(tNode);
                }
            }

        }

    }

    private void checkIndex(int startIndex) {
        if (startIndex > nodes.size()) {
            throw new IndexOutOfBoundsException();
        }
    }


    private void dfsR(Graph.Node<T> node) {
        node.markVisited();
        node.printNode();
        List<Node<T>> nodes = node.adjacent;
        for (Node<T> n : nodes) {
            if (!n.visited) {
                dfsR(n);
            }
        }
    }

    public void dfsR(int startIndex) {
        checkIndex(startIndex);

        Node<T> first = nodes.get(startIndex);
        this.dfsR(first);
    }

    public void bfs(int startIndex) {
        checkIndex(startIndex);

        Node<T> first = nodes.get(startIndex);
        Queue<Node<T>> queue = new Queue<>();
        queue.add(first);
        first.markVisited();

        while (!queue.isEmpty()) {
            Node<T> node = queue.remove();

            List<Node<T>> nodes = node.adjacent;

            for (Node<T> n : nodes) {
                if (!n.visited) {
                    n.markVisited();
                    queue.add(n);
                }
            }
            node.printNode();
        }
    }

    static class Node<T> {

        T data;
        List<Node<T>> adjacent;
        boolean visited;

        public Node (T data) {
            this.data = data;
            adjacent = new LinkedList<>();
            visited = false;
        }

        public void addEdge(Node<T> node) {
            if (node != null) {
                this.adjacent.add(node);
            }
        }

        public void addEdge(List<Node<T>> nodes) {
            for (Node<T> n : nodes) {
                if (n != null) {
                    this.adjacent.add(n);
                }
            }
        }

        public void markVisited() {
            this.visited = true;
        }

        public void printNode() {
            System.out.println(this.data);
        }

    }
}
