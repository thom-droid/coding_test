package ps.programmers.lvl01.simulation;

import java.util.Arrays;

public class Feb0222_01 {

    public String solution(String[] cards1, String[] cards2, String[] goal) {
        boolean result1 = isPossible(cards1, cards2, goal);
        boolean result2 = isPossible(cards2, cards1, goal);
        return result1 || result2 ? "Yes" : "No";
    }

    private boolean isPossible(String[] cards1, String[] cards2, String[] goal) {
        String[] clone = new String[goal.length];
        int c1 = 0;
        int c2 = 0;
        for (int i = 0; i < goal.length; i++) {
            String s = goal[i];
            if (c1 < cards1.length && cards1[c1].equals(s)) {
                c1++;
                clone[i] = s;
                continue;
            }
            if (c2 < cards2.length && cards2[c2].equals(s)) {
                clone[i] = s;
                c2++;
            }
        }
        return (c1 == cards1.length && c2 == cards2.length) || Arrays.equals(clone, goal);
    }

}
