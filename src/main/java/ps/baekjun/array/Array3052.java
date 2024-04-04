package ps.baekjun.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Array3052 {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[42];
        for (int i = 0; i < 10; i++) {
            arr[Integer.parseInt(readLine(bufferedReader)) % 42]++;
        }

        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) cnt++;
        }
        System.out.println(cnt);

    }



    private static String readLine(BufferedReader bufferedReader) {
        try {
            return bufferedReader.readLine();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
