package ps.baekjun.geometric;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Geo27323 {

    public static void main(String[] args) {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(readLine(bufferedReader));
        int m = Integer.parseInt(readLine(bufferedReader));
        System.out.println(n * m);
    }

    private static String readLine(BufferedReader bufferedReader) {
        try {
            return bufferedReader.readLine();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
