package algo.graph.search;

import algo.graph.Graph;
import algo.graph.SimpleNode;

import java.util.LinkedList;

public class BFS {

    private final Graph graph;

    public BFS(Graph graph) {
        this.graph = graph;
    }

    public void bfs(int index) {
        System.out.println("====== BFS ======");
        LinkedList<SimpleNode> simpleNodes = new LinkedList<>();
        SimpleNode root = graph.getNode(index);
        simpleNodes.offer(root);
        root.setMarked(true);

        while (!simpleNodes.isEmpty()) {
            SimpleNode node = simpleNodes.poll();
            for (SimpleNode simpleNode : node.getAdjacent()) {
                if (!simpleNode.isMarked()) {
                    simpleNode.setMarked(true);
                    simpleNodes.offer(simpleNode);
                }
            }
            visit(node);
        }
    }

    public void bfs() {
        bfs(0);
    }

    private void visit(SimpleNode node) {
        System.out.println("node value = " + node.getData());
    }
}
