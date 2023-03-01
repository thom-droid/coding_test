package ds;

public class Queue<T> {

    int size;
    Node<T> head;
    Node<T> tail;

    public void enqueue(T node) {
        Node<T> t = tail;
        Node<T> newNode = new Node<>(node);
        tail = newNode;
        if (t == null) {
            head = newNode;
        } else {
            t.next = newNode;
        }
        size++;
    }

    public T dequeue() {
        if (size == 0) {
            return null;
        }

        Node<T> h = head;
        final T element = h.data;
        final Node<T> next = h.next;
        h = null;
        head = next;
        if (next == null) {
            tail = null;
        } else {
            next.prev = null;
        }

        size--;

        return element;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return size == 0;
    }


    public void print() {

        Node<T> node = head;
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    public void clear() {

        while(!this.isEmpty()){
            this.dequeue();
        }
    }

    public T head() {
        return head.data;
    }

    public T tail() {
        return tail.data;
    }
}
