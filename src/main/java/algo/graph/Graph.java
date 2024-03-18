package algo.graph;

public class Graph {

    SimpleNode[] nodes;

    public SimpleNode[] getNodes() {
        return nodes;
    }

    public SimpleNode getNode(int index) {
        return nodes[index];
    }

    public Graph(int size) {
        nodes = new SimpleNode[size];
        for (int i = 0; i < size; i++) {
            nodes[i] = new SimpleNode(i);
        }
    }

    public void addEdge(int node1Index, int node2Index) {
        SimpleNode node1 = this.nodes[node1Index];
        SimpleNode node2 = this.nodes[node2Index];

        if (!node1.getAdjacent().contains(node2)) {
            node1.getAdjacent().add(node2);
        }
        if (!node2.getAdjacent().contains(node1)) {
            node2.getAdjacent().add(node1);
        }
    }
}
