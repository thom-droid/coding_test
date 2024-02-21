package ps.programmers.sorting;

import java.util.Arrays;

public class HIndex {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{3,0,6,1,5}));
    }
    public static int solution(int[] citations) {
        int answer = 0;

        Arrays.sort(citations);

        for (int i = citations.length - 1; i >= 0; i--) {

            int count = citations.length - i;
            if (citations[i] <= count) {
                answer = citations[i];
                break;
            }

        }

        return answer;
    }
}
