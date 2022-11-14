package ps.programmers.warmups;

import java.util.*;

public class Rank {

    public int[] solution(int[][] score) {

        Integer[] averages = Arrays.stream(score).map(arr -> (arr[0] + arr[1]) / 2).sorted(Comparator.reverseOrder()).toArray(Integer[]::new);

        HashMap<Integer, Integer> map = new HashMap<>();

        int[] answer = new int[averages.length];

        int rank = 1;
        int cur = 0;

        for (Integer average : averages) {
            if (average == cur) {
                rank++;
                continue;
            }

            cur = average;
            map.put(average, rank++);
        }

        for (int i = 0; i < score.length; i++) {
            int val = map.get((score[i][0] + score[i][1]) / 2);
            answer[i] = val;
        }

        return answer;
    }
}
