package ps.programmers.lvl01;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class AppleBox {

    public int solution(int k, int m, int[] score) {
        int answer = 0;

        LinkedList<Integer> queue = Arrays.stream(score).boxed().sorted(Collections.reverseOrder()).collect(Collectors.toCollection(LinkedList::new));

        while (queue.size() >= m) {

            int min = 3;

            for (int i = 0; i < m; i++) {
                int apple = queue.poll();
                if (apple <= k) {
                    min = apple;
                }
            }

            answer += min * m;

        }

        return answer;
    }

    public int solution2(int k, int m, int[] score) {
        int answer = 0;

        Arrays.sort(score);

        for(int i = score.length; i >= m; i -= m){
            answer += score[i - m] * m;
        }

        return answer;
    }
}
