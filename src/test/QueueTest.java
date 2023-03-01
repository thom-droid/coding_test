package test;

import ds.Queue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QueueTest {

    Queue<Integer> queue = new Queue<>();

    @AfterEach
    void destroy() {
        queue.clear();
    }

    @Test
    public void enqueue() {

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        queue.print();
        Assertions.assertEquals(4, queue.size());

    }

    @Test
    public void dequeue() {

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        queue.print();

        queue.clear();

        Assertions.assertEquals(0, queue.size());

    }

    @Test
    public void headAndTail() {

        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(124);

        Assertions.assertEquals(queue.head(), 5);
        Assertions.assertEquals(queue.tail(), 124);


    }
}