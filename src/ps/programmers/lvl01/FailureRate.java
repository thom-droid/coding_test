package ps.programmers.lvl01;

import java.util.*;

public class FailureRate {

    public int[] solution(int N, int[] stages) {

        LinkedHashMap<Integer, Double> map = new LinkedHashMap<>();

        double[] arr = new double[N + 2];

        for (int i = 0; i < stages.length; i++) {
            arr[stages[i]]++;
        }

        for (int i = 1; i < arr.length - 1; i++) {

            if (i <= arr.length - 2 && arr[i] == 0) {
                if (arr[i + 1] == 0) {
                    map.put(i, 0.0);
                    continue;
                }

            }

            double nom = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                nom += arr[j];
            }

            arr[i] = arr[i] / nom;
            map.put(i, arr[i]);

        }

        List<Map.Entry<Integer, Double>> entries = new LinkedList<>(map.entrySet());
        entries.sort((o1, o2) -> Double.compare(o2.getValue(), o1.getValue()));

        int[] answer = entries.stream().mapToInt(Map.Entry::getKey).toArray();
        return answer;
    }

}
