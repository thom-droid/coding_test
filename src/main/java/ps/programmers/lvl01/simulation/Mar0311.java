package ps.programmers.lvl01.simulation;

import java.util.Arrays;
import java.util.HashMap;

public class Mar0311 {
    public int solution(String[] friends, String[] gifts) {

        Integer[][] graph = new Integer[friends.length][friends.length];
        int[] giftIdx = new int[friends.length];
        int[] giftToReceive = new int[friends.length];
        HashMap<String, Integer> giftMap = new HashMap<>();

        for (int i = 0; i < friends.length; i++) {
            giftMap.put(friends[i], i);
        }

        for (int i = 0; i < friends.length; i++) {
            for (int j = 0; j < friends.length; j++) {
                if (i == j) graph[i][j] = null;
                else graph[i][j] = 0;
            }
        }

        for (String s : gifts) {
            String[] gift = s.split(" ");
            int sender = giftMap.get(gift[0]);
            int receiver = giftMap.get(gift[1]);
            graph[sender][receiver]++;
        }

        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                if (i == j) continue;
                Integer friendIdx = giftMap.get(friends[i]);
                giftIdx[friendIdx] += graph[i][j];
                giftIdx[friendIdx] -= graph[j][i];
            }
        }

        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                if (i == j) continue;
                Integer f1 = giftMap.get(friends[i]);
                Integer f2 = giftMap.get(friends[j]);
                Integer f1ToF2 = graph[i][j];
                Integer f2ToF1 = graph[j][i];
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
        return Arrays.stream(giftToReceive).map(x -> x/2).max().orElse(0);
    }
}
