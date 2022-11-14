package ps.programmers.warmups;

import java.util.*;

public class WeirdSort {

    public int[] solution(int[] numlist, int n) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : numlist) {
            map.put(num, Math.abs(n - num));
        }

        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(map.entrySet());

        Comparator<Map.Entry<Integer, Integer>> mapComparator = (o1, o2) -> {
            if (Objects.equals(o1.getValue(), o2.getValue())) {
                return o2.getKey() - o1.getKey();
            }
            return o1.getValue() - o2.getValue();
        };

        return entries.stream().sorted(mapComparator).map(Map.Entry::getKey).mapToInt(Integer::intValue).toArray();
    }

}
