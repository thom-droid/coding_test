package ps.programmers.warmups;

import java.util.ArrayList;

public class CursedNumberThree {

    public int solution(int n) {
        if (n <= 2) {
            return n;
        }

        int[] numbers = new int[n + 1];
        int val = 3;
        numbers[1] = 1;
        numbers[2] = 2;


        for (int i = 3; i < numbers.length; i++) {

            while(val % 3 == 0 || val / 10 == 3 || val % 10 == 3 || val / 10 % 10 == 3) {
                val++;
            }

            numbers[i] = val;
            val++;
        }

        return numbers[n];
    }


}
