package ps.programmers.lvl02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class TangerinePicker138476 {

    public int solution(int k, int[] tangerine) {

        int max = 0;
        int answer = 1;

        for (int j : tangerine) {
            if (max < j) {
                max = j;
            }
        }

        int[] counting = new int[max + 1];

        for (int j : tangerine) {
            counting[j]++;
        }

        Arrays.sort(counting);

        for (int i = counting.length - 1; i >= 0; i--) {

            if (k <= counting[i]) {
                break;
            }

            k -= counting[i];
            answer++;
        }


        return answer;
    }

    public int solution2(int k, int[] tangerine) {
        int answer = 1;
        HashMap<Integer, Integer> tangerines = new HashMap<>();

        for (int i : tangerine) {
            tangerines.put(i, tangerines.getOrDefault(i, 0) + 1);
        }

        ArrayList<Integer> list = new ArrayList<>(tangerines.keySet());

        list.sort((o1, o2) -> tangerines.get(o2).compareTo(tangerines.get(o1)));

        for (Integer key : list) {
            if (k <= tangerines.get(key)) {
                return answer;
            }

            k -= tangerines.get(key);
            answer++;
        }

        return answer;
    }

}
