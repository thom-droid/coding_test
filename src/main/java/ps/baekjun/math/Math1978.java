package ps.baekjun.math;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class Math1978 {

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        boolean[] primes = new boolean[1001];
        Arrays.fill(primes, true);
        for (int i = 2; i < 1001; i++) {
            for (int j = 2; j < 1001; j++) {
                if (i * j < primes.length) {
                    primes[i * j] = false;
                } else {
                    break;
                }
            }
        }

        int i = Integer.parseInt(readLine(bufferedReader));// skip n
        int count = 0;
        String[] split = readLine(bufferedReader).split(" ");
        for (String s : split) {
            int n = Integer.parseInt(s);
            if (n == 1) continue;
            if (primes[n]) {
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean isPrime(int n) {
        if (n == 1) return false;
        if (n == 2) return true;
        for (int i = 3; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    private static String readLine(BufferedReader bufferedReader) {
        try {
            return bufferedReader.readLine();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
