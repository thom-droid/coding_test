package ps.programmers.warmups;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class Rank {

    public int[] solution(int[][] score) {

        int[] answer = new int[score.length];

        HashMap<Double, Integer> map = new HashMap<>();

        Double[] averages = Arrays.stream(score).map(arr -> ((double) arr[0] + arr[1]) / 2).sorted(Comparator.reverseOrder()).toArray(Double[]::new);

        for (int i = 0; i < averages.length; i++) {
            map.putIfAbsent(averages[i], i + 1);
        }

        for (int i = 0; i < score.length; i++) {

            int rank = map.get(((double) score[i][0] + score[i][1]) / 2);

            answer[i] = rank;
        }

        return answer;
    }
}
