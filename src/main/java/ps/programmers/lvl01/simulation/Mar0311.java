package ps.programmers.lvl01.simulation;

import java.util.Arrays;
import java.util.HashMap;

public class Mar0311 {

    public int solution(String[] friends, String[] gifts) {

        int[][] graph = new int[friends.length][friends.length];
        int[] giftIdx = new int[friends.length];
        int[] giftToReceive = new int[friends.length];
        HashMap<String, Integer> giftMap = new HashMap<>();

        for (int i = 0; i < friends.length; i++) {
            giftMap.put(friends[i], i);
        }

        for (String s : gifts) {
            String[] gift = s.split(" ");
            int sender = giftMap.get(gift[0]);
            int receiver = giftMap.get(gift[1]);
            if (sender == receiver) continue;
            graph[sender][receiver]++;
            giftIdx[sender]++;
            giftIdx[receiver]--;
        }

        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                if (i == j) continue;
                Integer f1 = giftMap.get(friends[i]);
                Integer f2 = giftMap.get(friends[j]);
                int f1ToF2 = graph[i][j];
                int f2ToF1 = graph[j][i];
                if (f1ToF2 > f2ToF1) {
                    giftToReceive[f1]++;
                } else if (f2ToF1 > f1ToF2) {
                    giftToReceive[f2]++;
                } else {
                    if (giftIdx[f1] > giftIdx[f2]) {
                        giftToReceive[f1]++;
                    } else if (giftIdx[f2] > giftIdx[f1]) {
                        giftToReceive[f2]++;
                    }
                }
            }
        }
        return Arrays.stream(giftToReceive).map(x -> x / 2).max().orElse(0);
    }
}
