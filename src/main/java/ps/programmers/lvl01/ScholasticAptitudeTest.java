package ps.programmers.lvl01;

import java.util.*;
import java.util.stream.Collectors;

public class ScholasticAptitudeTest {

    // Dude who Gave Up (on) the Math DGU
    private static int[] DGU1 = {1, 2, 3, 4, 5};
    private static int[] DGU2 = {2, 1, 2, 3, 2, 4, 2, 5};
    private static int[] DGU3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

    public int[] solution(int[] answers) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 0);
        map.put(2, 0);
        map.put(3, 0);

        for (int i = 0; i < answers.length; i++) {

            if (answers[i] == DGU1[i % 5]) {
                map.put(1, map.get(1) + 1);
            }

            if (answers[i] == DGU2[i % 8]) {
                map.put(2, map.get(2) + 1);
            }

            if (answers[i] == DGU3[i % 10]) {
                map.put(3, map.get(3) + 1);
            }

        }

        List<Map.Entry<Integer, Integer>> entries = new LinkedList<>(map.entrySet());

        if (Objects.equals(map.get(1), map.get(2)) || Objects.equals(map.get(1), map.get(3)) || Objects.equals(map.get(2), map.get(3))) {

            return entries.stream().sorted(Comparator.comparingInt(Map.Entry::getValue)).mapToInt(Map.Entry::getKey).toArray();

        }

        int[] answer = new int[1];

        answer[0] = entries.stream().max(Comparator.comparingDouble(Map.Entry::getValue)).map(Map.Entry::getKey).get();

        return answer;

    }

    public int[] solution2(int[] answers) {

        int[][] arr = new int[3][2];

        for (int i = 0; i < arr.length; i++) {
            arr[i][0] = i + 1;
        }

        for (int i = 0; i < answers.length; i++) {

            if (answers[i] == DGU1[i % 5]) {
                arr[0][1]++;
            }

            if (answers[i] == DGU2[i % 8]) {
                arr[1][1]++;
            }

            if (answers[i] == DGU3[i % 10]) {
                arr[2][1]++;
            }

        }

        Arrays.sort(arr, ((o1, o2) -> o2[1] - o1[1]));

        ArrayList<Integer> list = new ArrayList<>();

        if (arr[0][1] == arr[1][1]) {

            if (arr[1][1] == arr[2][1]) {
                return new int[]{arr[0][0], arr[1][0], arr[2][0]};
            }

            return new int[]{arr[0][0], arr[1][0]};
        }

        return new int[]{arr[0][0]};
    }
}
