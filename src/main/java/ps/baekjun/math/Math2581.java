package ps.baekjun.math;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Math2581 {

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(readLine(bufferedReader));
        int n = Integer.parseInt(readLine(bufferedReader));

        int sum = 0;
        int min = 0;

        for (int i = m; i <= n; i++) {
            if (isPrime(i)) {
                sum += i;
                if (min == 0) {
                    min = i;
                }
            }
        }

        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
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
