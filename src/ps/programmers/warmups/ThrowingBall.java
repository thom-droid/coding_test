package ps.programmers.warmups;

import java.util.LinkedList;

public class ThrowingBall {

    public int solution(int[] numbers, int k) {
        LinkedList<Integer> queue = new LinkedList<>();

        for (int i = 0; i < numbers.length; i +=2) {
            queue.add(numbers[i]);
        }

        if (numbers.length % 2 == 1) {
            for (int i = 1; i < numbers.length; i += 2) {
                queue.add(numbers[i]);
            }
        }

        while (k != 0) {
            queue.add(queue.poll());
            k--;
        }

        return queue.getLast();
    }
}
