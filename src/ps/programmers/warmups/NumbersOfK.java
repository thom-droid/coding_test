package ps.programmers.warmups;

import java.util.Arrays;
import java.util.stream.IntStream;

public class NumbersOfK {

    public int solution(int i, int j, int k) {
        int count = 0;

        for (int n = i; n <= j; n++) {

            count += count(n, k);
        }

        return count;
    }

    public int count(int i, int num) {
        int count = 0;

        while (i != 0) {
            if (num == i % 10) {
                count++;
            }
            i /= 10;
        }

        return count;
    }
}
