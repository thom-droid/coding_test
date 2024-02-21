package ps.programmers.warmups;

import java.util.Arrays;

public class MostCommonValue {

    public static void main(String[] args) {
        System.out.println(getCommon(new int[]{1,2,3,3,4}));
    }

    private static int getCommon(int[] array) {

        int[] counting = new int[1000];

        for (int value : array) {
            counting[value]++;
        }

        int max = 0;
        int answer = 0;

        for (int i = 0; i < counting.length; i++) {
            if (counting[i] > max) {
                max = counting[i];
                answer = i;
            }
        }

        int cnt = 0;

        for (int j : counting) {
            if (max == j) {
                cnt++;
            }
        }

        if (cnt >= 2) {
            return -1;
        }

        return answer;
    }

}
