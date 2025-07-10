package ps.baekjun.math;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Math11653 {

    private static boolean[] prime;
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(readLine(bufferedReader));
        prime = new boolean[i + 1];
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (!prime[j]) {
                for (int k = j * j; k <= i; k += j) {
                    prime[k] = false;
                }
            }
        }
        printPrimeFactor(i);
    }

    private static void printPrimeFactor(int i) {
        if (i == 1) {
            return;
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int j = 2; j <= i; j++) {
            if (prime[j]) {
                while (i % j == 0) {
                    stringBuilder.append(j).append("\n");
                    i /= j;
                }
            }
        }

        System.out.println(stringBuilder);

    }

    private static String readLine(BufferedReader bufferedReader) {
        try {
            return bufferedReader.readLine();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean isPrime(int num){

        if (num < 2) {
            return false;
        }

        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }

        return true;
    }
}
