package ps.baekjun.geometric;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Geo1085 {

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = Arrays.stream(readLine(bufferedReader).split(" ")).mapToInt(Integer::parseInt).toArray();
        int x = array[0];
        int y = array[1];
        int w = array[2];
        int h = array[3];
        System.out.println(getMin(x, y, w, h));
    }

    private static int getMin(int x, int y, int w, int h) {
        return Math.min(Math.min(x, y), Math.min(w - x, h - y));
    }

    private static String readLine(BufferedReader bufferedReader) {
        try {
            return bufferedReader.readLine();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
