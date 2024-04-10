package ps.baekjun.simulation;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Simulation2563_02 {

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[][] paper = new int[100][100];
        int n = Integer.parseInt(readLine(bufferedReader));
        for (int i = 0; i < n; i++) {
            String[] split = readLine(bufferedReader).split(" ");
            int x = Integer.parseInt(split[0]) - 1;
            int y = Integer.parseInt(split[1]) - 1;
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    paper[x + j][y + k] = 1;
                }
            }
        }

        int area = 0;
        for (int[] ints : paper) {
            for (int anInt : ints) {
                if (anInt == 1) {
                    area++;
                }
            }
        }
        System.out.println(area);
    }

    private static String readLine(BufferedReader bufferedReader) {
        try {
            return bufferedReader.readLine();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
