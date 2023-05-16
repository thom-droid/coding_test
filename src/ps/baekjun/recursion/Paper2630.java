package ps.baekjun.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Paper2630 {

    private static int blue = 0;
    private static int white = 0;
    private static int[][] paper;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        paper = new int[size][size];

        StringTokenizer st;
        for (int i = 0; i < size; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            for (int j = 0; j < size; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        compress(0, 0, size);

        System.out.println(white);
        System.out.println(blue);
    }

    private static void compress(int row, int col, int size) {

        if (checkColor(row, col, size)) {
            if (paper[row][col] == 1) {
                blue++;
            } else {
                white++;
            }
            return;
        }

        size = size / 2;

        compress(row, col, size); // 2
        compress(row, col + size, size); // 1
        compress(row + size, col, size);
        compress(row + size, col + size, size);
    }

    private static boolean checkColor(int row, int col, int size) {
        int color = paper[row][col];

        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size - 1; j++) {
                if (paper[i][j] != color) {
                    return false;
                }
            }
        }
        return true;
    }
}
