package ps.programmers.lvl02;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class Printer42587 {

    public int solution(int[] priorities, int location) {

        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < priorities.length; i++) {
            map.put(i, priorities[i]);
        }

        Arrays.sort(priorities);

        int maxIdx = priorities.length - 1;
        int i = 0;
        int count = 0;

        while (!map.isEmpty()) {

            int max = priorities[maxIdx];

            if (!map.containsKey(i)) {

                i++;

                if (i == priorities.length) {
                    i = 0;
                }

                continue;
            }

            int val = map.get(i);

            if (val < max) {
                map.remove(i);
                map.put(i, val);
            }

            if (val == max) {
                count++;
                if (i == location) {
                    break;
                }
                map.remove(i);
                maxIdx--;
            }

            i++;

            if (i == priorities.length) {
                i = 0;
            }

        }

        return count;
    }
}
