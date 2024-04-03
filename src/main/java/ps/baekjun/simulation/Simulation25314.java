package ps.baekjun.simulation;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Simulation25314 {

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(readLine(bufferedReader)) / 4;

        StringBuilder stringBuilder = new StringBuilder();
        String str = "long ";
        for (int i = 0; i < n; i++) {
            stringBuilder.append(str);
        }
        stringBuilder.append("int");
        System.out.println(stringBuilder.toString());
    }

    private static String readLine(BufferedReader bufferedReader) {
        try {
            return bufferedReader.readLine();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
