package algo.graph.search;

import algo.graph.Graph;
import algo.graph.SimpleNode;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Optional;

public class DFS {

    private final Graph graph;

    public DFS(Graph graph) {
        this.graph = graph;
    }

    public void dfs(int index) {
        System.out.println("======= dfs =======");
        SimpleNode root = graph.getNode(index);
        LinkedList<SimpleNode> simpleNodes = new LinkedList<>();

        simpleNodes.push(root);
        root.setMarked(true);

        while (!simpleNodes.isEmpty()) {
            SimpleNode node = simpleNodes.pop();
            System.out.println("node value = " + node.getData());
            for (SimpleNode simpleNode : node.getAdjacent()) {
                if (!simpleNode.isMarked()) {
                    simpleNode.setMarked(true);
                    simpleNodes.push(simpleNode);
                }
            }
        }
    }

    public void dfs() {
        dfs(0);
    }

    public void dfsR(int index) {
        SimpleNode node = Optional
                .ofNullable(graph.getNode(index))
                .orElseThrow(() -> new NoSuchElementException("no node"));
        dfsR(node);
    }

    public void dfsR(SimpleNode node) {
        if (node == null) return;
        node.setMarked(true);
        node.visit();
        for (SimpleNode simpleNode : node.getAdjacent()) {
            if (!simpleNode.isMarked()) dfsR(simpleNode);
        }
    }

}
