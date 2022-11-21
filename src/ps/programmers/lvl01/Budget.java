package ps.programmers.lvl01;

import java.util.Arrays;

public class Budget {

    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int answer = 0;

        for (int i : d) {
            budget -= i;
            if (budget < 0) {
                break;
            }
            answer++;

        }

        return answer;
    }


}
