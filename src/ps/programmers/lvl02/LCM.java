package ps.programmers.lvl02;

import java.util.ArrayList;

public class LCM {

    public int solution(int[] arr) {

        int sum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            sum = getLCM(arr[i], sum);
        }

        return sum;
    }

    private int getLCM(int a, int b) {
        return a * b / getGCD(a, b);
    }

    private int getGCD(int a, int b) {

        int tmp2;

        if (b < a) {
            tmp2 = a;
            a = b;
            b = tmp2;
        }

        while (a > 0) {
            int tmp = a;
            a = b % a;
            b = tmp;
        }

        return b;
    }
}
