package ps.baekjun.condition;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Condition2525 {

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = readline(bufferedReader);
        String[] split = line.split(" ");
        int hour = Integer.parseInt(split[0]);
        int minute = Integer.parseInt(split[1]);
        int time = Integer.parseInt(readline(bufferedReader));
        int wholeTime = hour * 60 + minute + time;
        int resultHour = wholeTime / 60;
        int resultMinute = wholeTime % 60;
        if (resultHour >= 24) {
            resultHour -= 24;
        }

        System.out.println(resultHour + " " + resultMinute);
    }

    private static String readline(BufferedReader bufferedReader) {
        try {
            return bufferedReader.readLine();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
