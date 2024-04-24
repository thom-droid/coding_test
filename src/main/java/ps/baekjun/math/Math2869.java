package ps.baekjun.math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Math2869 {

    public static void main(String[] args) {
        String[] split = readLine(new BufferedReader(new InputStreamReader(System.in))).split(" ");
        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[1]);
        int v = Integer.parseInt(split[2]);
        int day = (v - b) / (a - b);
        if ((v - b) % (a - b) != 0) {
            day++;
        }
        System.out.println(day);
    }

    private static String readLine(BufferedReader bufferedReader) {
        try {
            return bufferedReader.readLine();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
