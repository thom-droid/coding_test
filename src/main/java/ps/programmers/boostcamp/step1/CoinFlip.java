package ps.programmers.boostcamp.step1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CoinFlip {

    public int solution(int[] coin, int k) {

        int sum = IntStream.of(coin).sum();

        if(coin.length == 1) return 0;
        if(sum == 0 || sum == coin.length) return 0;
        if(sum != k && coin.length ==k) return -1;

        int flipToHead = flip(Arrays.copyOf(coin, coin.length), k, 0);
        int flipToTail = flip(Arrays.copyOf(coin, coin.length), k, 1);

        int answer = Math.min(flipToHead, flipToTail);
        return answer == Integer.MAX_VALUE ? -1 : answer;
    }

    private int flip(int[] coin, int k, int bit) {
        int count = 0;

        for (int i = 0; i < coin.length - k + 1; i++) {
            if(coin[i] == bit) continue;

            for (int j = i; j < i + k; j++) {
                coin[j] = 1 - coin[j];
            }
            count++;
        }

        int sum = IntStream.of(coin).filter(c -> c == bit).sum();

        if(sum == coin.length) return count;
        return Integer.MAX_VALUE;
    }

}
