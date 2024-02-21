package ps.programmers.lvl01;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class KeyBoard {

    public int[] solution(String[] keymap, String[] targets) {

        final Map<String, Integer> map = new HashMap<>();
        int[] result = new int[targets.length];

        for (String s : keymap) {

            for (int i = 0; i < s.length(); i++) {

                char c = s.charAt(i);
                String key = String.valueOf(c);
                int idx = s.indexOf(key) + 1;

                if (!map.containsKey(key)) {
                    map.put(key, idx);
                    continue;
                }

                int val = map.get(key);
                int closest = Math.min(idx, val);
                map.put(key, closest);

            }
        }

        for (int i = 0; i < targets.length; i++) {

            String target = targets[i];
            int count = 0;
            for (int j = 0; j < target.length(); j++) {

                String s = String.valueOf(target.charAt(j));

                if (!map.containsKey(s)) {
                    count = -1;
                    break;
                }

                count += map.get(s);

            }

            result[i] = count;
        }

        return result;
    }
}
