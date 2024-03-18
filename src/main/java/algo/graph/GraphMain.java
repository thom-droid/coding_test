package algo.graph;

import algo.graph.search.BFS;
import algo.graph.search.DFS;

public class GraphMain {

    public static Graph graph = populateGraph();

    public static Graph populateGraph() {
        Graph graph = new Graph(9);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);
        graph.addEdge(3, 5);
        graph.addEdge(5, 6);
        graph.addEdge(5, 7);
        graph.addEdge(6, 8);
        return graph;
    }

    public static void doBfs() {
        doBfs(populateGraph(), 0);
    }

    public static void doBfs(Graph graph, int index) {
        new BFS(graph).bfs(index);
    }

    public static void doDfs() {
        doDfs(populateGraph(), 0);
    }

    public static void doDfs(Graph graph, int index) {
        new DFS(graph).dfs(index);
    }

    public static void doDfsRecursive() {
        doDfsRecursive(populateGraph(), 0);
    }

    public static void doDfsRecursive(Graph graph, int index) {
        new DFS(graph).dfsR(index);
    }

    public static void main(String[] args) {
        doDfs();
        doBfs();

        System.out.println("recursive dfs ");
        doDfsRecursive();
    }
}
