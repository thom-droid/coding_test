package ps.programmers.lvl01.sort.heap;

import java.util.PriorityQueue;

public class Mar0306_01 {
    public int[] solution(int k, int[] score) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        int[] answer = new int[score.length];
        for (int i = 0; i < score.length; i++) {
            heap.add(score[i]);
            if (i >= k) heap.poll();
            answer[i] = heap.peek();
        }
        return answer;
    }
    // queue does not guarantee the order of the elements when trying to loop through it.
    // only methods like peek(), poll(), or remove() guarantee to present the value in the order of the elements.
}
