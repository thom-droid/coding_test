package ps.programmers.lvl02;

import java.util.Arrays;

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



}
