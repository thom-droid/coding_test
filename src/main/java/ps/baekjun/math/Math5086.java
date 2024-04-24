package ps.baekjun.math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Math5086 {

    public static void main(String[] args) {
        String[] answer = {"factor", "multiple", "neither"};
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String[] split = readLine(bufferedReader).split(" ");
            int a = Integer.parseInt(split[0]);
            int b = Integer.parseInt(split[1]);

            if (a == 0 && b == 0) {
                break;
            }

            if (b % a == 0) {
                System.out.println(answer[0]);
            } else if (a % b == 0) {
                System.out.println(answer[1]);
            } else {
                System.out.println(answer[2]);
            }
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
