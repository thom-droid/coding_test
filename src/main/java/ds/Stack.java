package ds;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class Stack<T> {

    static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    int size;
    Node<T> top;

    public void push(T node) {
        Node<T> newNode = new Node<>(node);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public T pop() {
        if (top == null) {
            throw new EmptyStackException();
        }

        T element = top.data;
        top = top.next;
        size--;

        return element;
    }

    public T peek() {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        }

        return top.data;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return this.size;
    }

    public void print() {

        Node<T> node = top;
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    public void clear() {

        while(!this.isEmpty()){
            this.pop();
        }
    }
}
