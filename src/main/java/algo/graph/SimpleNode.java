package algo.graph;

import java.util.LinkedList;

public class SimpleNode {
    int data;
    LinkedList<SimpleNode> adjacent;
    boolean marked;

    public SimpleNode(int data) {
        this.data = data;
        this.marked = false;
        this.adjacent = new LinkedList<>();
    }

    public int getData() {
        return data;
    }

    public LinkedList<SimpleNode> getAdjacent() {
        return adjacent;
    }

    public boolean isMarked() {
        return marked;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setAdjacent(LinkedList<SimpleNode> adjacent) {
        this.adjacent = adjacent;
    }

    public void setMarked(boolean marked) {
        this.marked = marked;
    }

    public void visit() {
        System.out.println("node value = " + this.getData());
    }
}
