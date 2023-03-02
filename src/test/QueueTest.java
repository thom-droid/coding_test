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

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        queue.print();
        Assertions.assertEquals(4, queue.size());

    }

    @Test
    public void dequeue() {

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        queue.print();

        queue.clear();

        Assertions.assertEquals(0, queue.size());

    }

}