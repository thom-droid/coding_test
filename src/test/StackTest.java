package test;


import ds.Stack;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StackTest {

    Stack<Integer> stack = new Stack<>();

    @AfterEach
    public void destroy() {
        stack.clear();
    }

    @Test
    public void print() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.print();
        Assertions.assertEquals(5, stack.size());
    }

    @Test
    public void pop() {
        stack.push(2);
        stack.push(2);
        stack.push(3);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(12);
        stack.clear();
        Assertions.assertTrue(stack.isEmpty());
    }


}
