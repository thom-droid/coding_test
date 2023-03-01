package ds;

import java.util.LinkedList;
import java.util.List;

public class Node<T> {

    T data;
    Node<T> prev;
    Node<T> next;
    List<Node<T>> adjacent;
    boolean visited;

    public Node (T data) {
        this.data = data;
        adjacent = new LinkedList<>();
        visited = false;
    }

}
