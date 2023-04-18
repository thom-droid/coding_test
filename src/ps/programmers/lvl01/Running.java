package ps.programmers.lvl01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Running {

    public String[] solution(String[] players, String[] callings) {

        Map<String, Integer> rankMap = new HashMap<>();

        for (int i = 0; i < players.length; i++) {

            String player = players[i];

            rankMap.put(player, i);
        }

        for (String calling : callings) {

            int idx = rankMap.get(calling);
            String tmp = players[idx - 1];
            players[idx - 1] = calling;
            players[idx] = tmp;
            rankMap.put(calling, idx - 1);
            rankMap.put(tmp, idx);

        }

        return players;
    }
}
