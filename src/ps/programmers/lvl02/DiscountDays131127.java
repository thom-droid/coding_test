package ps.programmers.lvl02;

import java.util.HashMap;
import java.util.Map;

public class DiscountDays131127 {

    public int solution(String[] want, int[] number, String[] discount) {
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, Integer> tempMap = new HashMap<>();
        int answer = 0;
        boolean matched;

        for (int i = 0; i < want.length; i++) {
            map.put(want[i], number[i]);
        }

        for (int i = 0; i <= discount.length - 10; i++) {

            matched = true;
            tempMap.putAll(map);

            for (int j = i; j < 10 + i; j++) {
                if (tempMap.containsKey(discount[j])) {
                    tempMap.put(discount[j], tempMap.get(discount[j]) - 1);
                }
            }

            for (Map.Entry<String, Integer> entry : tempMap.entrySet()) {
                if (entry.getValue() != 0) {
                    matched = false;
                    break;
                }
            }

            if (matched) {
                answer++;
            }
        }
        return answer;
    }
}
