package ds;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class Queue<T> {

    static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    int size;
    Node<T> first;
    Node<T> last;

    public void add(T node) {
        Node<T> newNode = new Node<>(node);

        if (last != null) {
            last.next = newNode;
        }
        last = newNode;

        if (first == null) {
            first = last;
        }

        size++;
    }

    public T remove() {

        if (first == null) {
            throw new NoSuchElementException();
        }

        T element = first.data;
        first = first.next;

        if (first == null) {
            last = null;
        }

        size--;

        return element;
    }

    public T peek() {
        return first.data;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void print() {

        Node<T> node = first;
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    public void clear() {

        while(!this.isEmpty()){
            this.remove();
        }
    }

}
