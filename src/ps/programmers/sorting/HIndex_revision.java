package ps.programmers.sorting;

import java.util.Arrays;

public class HIndex_revision {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 7, 8, 9}));
        System.out.println(solution(new int[]{3, 0, 6, 1, 5}));
        System.out.println(solution(new int[]{12, 11, 10, 9, 8, 1}));
        System.out.println(solution(new int[]{0,1,2}));
        System.out.println(solution(new int[]{0,0,0}));
    }

    public static int solution(int[] citations) {

        int max = Arrays.stream(citations).distinct().max().orElse(0);

        int[] counting = new int[max + 1];

        for (int i = 0; i < citations.length; i++) {
            counting[citations[i]]++;
        }

        for (int i = counting.length - 1; i >= 1; i--) {
            counting[i - 1] = counting[i] + counting[i - 1];
        }

        // 0까지 내려갔다면 0을 리턴하면 됨
        for (int i = counting.length - 1; i >= 1; i--) {

            if (counting[i] >= i) {
                return i;
            }

        }

        return 0;
    }
}
