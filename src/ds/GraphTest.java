package ds;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class GraphTest {

    Graph<Integer> graph = new Graph<>();

    @Before
    public void setup() {

        Graph.Node<Integer> root = new Graph.Node<>(0);
        Graph.Node<Integer> n1 = new Graph.Node<>(1);
        Graph.Node<Integer> n2 = new Graph.Node<>(2);
        Graph.Node<Integer> n3 = new Graph.Node<>(3);
        Graph.Node<Integer> n4 = new Graph.Node<>(4);
        Graph.Node<Integer> n5 = new Graph.Node<>(5);
        Graph.Node<Integer> n6 = new Graph.Node<>(6);
        Graph.Node<Integer> n7 = new Graph.Node<>(7);
        Graph.Node<Integer> n8 = new Graph.Node<>(8);

        root.addEdge(n1);
        n1.addEdge(List.of(n2, n3));
        n2.addEdge(List.of(n3, n4));
        n3.addEdge(List.of(n2, n4, n5));
        n4.addEdge(List.of(n2, n3));
        n5.addEdge(List.of(n3, n6, n7));
        n6.addEdge(List.of(n5, n8));
        n7.addEdge(n5);
        n8.addEdge(n6);

        graph.addNode(List.of(root, n1, n2, n3, n4, n5, n6, n7, n8));

    }
    @Test
    public void dfs() {

        graph.dfs(0);

    }

    @Test
    public void dfsR() {

        graph.dfsR(0);

    }

    @Test
    public void bfs() {
        graph.bfs(0);

    }
}