package ps.programmers.lvl02;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class SavingBoat {

    public int solution(int[] people, int limit) {

        Arrays.sort(people);
        boolean[] checked = new boolean[people.length];

        int answer = 0;

        for (int i = people.length - 1; i >= 0; i--) {

            if (checked[i]) {
                continue;
            }

            int weightLeft = limit - people[i];
            checked[i] = true;

            for (int j = i - 1; j >= 0; j--) {
                if (checked[j]) {
                    continue;
                }

                if (weightLeft >= people[j]) {
                    checked[j] = true;
                    break;
                }
            }

            answer++;
        }

        return answer;
    }

    public int solution2(int[] people, int limit) {

        int answer = 0;
        LinkedList<Integer> queue = new LinkedList<>();

        for (int i = 0; i < people.length; i++) {
            queue.add(people[i]);
        }

        Collections.sort(queue);

        while (!queue.isEmpty()) {

            if (queue.size() == 1) {
                answer++;
                break;
            }

            int weightLeft = limit - queue.pollLast();
            int head = queue.peek();

            if (head <= weightLeft) {
                queue.pop();
            }
            answer++;
        }

        return answer;
    }

}
