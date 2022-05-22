package ps.baekjun.stack;

public class CustomStack {

    private Node head;
    private Node tail;
    private Node vertex;
    private int size = 0;

    class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    private void push(int data) {
        // if there is no head, meaning that the stack is empty
        if (head == null) {
            head = new Node(data);
            size++;
            return ;
        }

        // if there are nodes filled here, then this node being inserted must be the head,
        // meaning already existing head to be moved to the next
        Node newNode = new Node(data);
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        size++;

    }



}
