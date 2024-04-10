package ps.baekjun.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Array2566 {

    public static void main(String[] args) {


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[][] array = new int[9][9];
        int max = 0;
        int x = 0;
        int y = 0;
        for (int i = 0; i < array.length; i++) {
            String[] s = readLine(bufferedReader).split(" ");
            for (int j = 0; j < array.length; j++) {
                array[i][j] = Integer.parseInt(s[j]);
                if (max < array[i][j]) {
                    max = array[i][j];
                    x = i;
                    y = j;
                }
            }
        }

        System.out.println(max);
        System.out.println((x + 1) + " " + (y + 1));
    }

    private static String readLine(BufferedReader bufferedReader) {
        try {
            return bufferedReader.readLine();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}


