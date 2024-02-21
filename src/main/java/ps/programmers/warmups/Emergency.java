package ps.programmers.warmups;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class Emergency {

    public int[] solution(int[] emergency) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Integer[] clone = Arrays.stream(Arrays.copyOf(emergency, emergency.length)).boxed().toArray(Integer[]::new);
        int[] result = new int[emergency.length];

        Arrays.sort(clone, Comparator.reverseOrder());

        for (int i = 0; i < emergency.length; i++) {
            map.putIfAbsent(clone[i], i +1);
        }

        for (int i = 0; i < emergency.length; i++) {
            result[i] = map.get(emergency[i]);
        }

        return result;

    }

}
