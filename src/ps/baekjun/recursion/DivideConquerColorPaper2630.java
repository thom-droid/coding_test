package ps.baekjun.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class DivideConquerColorPaper2630 {

    private static int blue = 0;
    private static int white = 0;
    private static int[][] paper;
    private static final int BLUE = 1;
    private static final int WHITE = 0;

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

        partition(0, 0, size);

        System.out.println(white);
        System.out.println(blue);
    }

    private static boolean checkColor(int row, int col, int size) {

        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size - 1; j++) {
                if (paper[i][j] != paper[i][j + 1]) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void partition(int row, int col, int size) {

        if (checkColor(row, col, size)) {
            int color = paper[row][col];
            if (color == BLUE) {
                blue++;
            } else {
                white++;
            }
            return;
        }

        size = size / 2;

        partition(row, col, size); // 2
        partition(row, col + size, size);
        partition(row + size, col, size);
        partition(row + size, col + size, size);

    }
}
