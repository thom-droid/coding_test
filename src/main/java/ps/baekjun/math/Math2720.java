package ps.baekjun.math;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Math2720 {

    public static void main(String[] args) {
        int[] coins = {25, 10, 5, 1};
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(readLine(bufferedReader));

        for (int j = 0; j < i; j++) {
            int[] exchanges = new int[4];
            int exchange = Integer.parseInt(readLine(bufferedReader));
            while (exchange > 0) {
                for (int k = 0; k < coins.length; k++) {
                    int coin = coins[k];
                    exchanges[k] = exchange / coin;
                    exchange %= coin;
                }
            }
            Arrays.stream(exchanges).forEach(c -> System.out.print(c + " "));
            System.out.println();
        }
    }

    private static String readLine(BufferedReader bufferedReader) {
        try {
            return bufferedReader.readLine();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
