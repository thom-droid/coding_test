package ps.baekjun.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class QuadTreeCompression {

    private static int[][] image;
    private static final int WHITE = 0;
    private static final int BLACK = 1;
    public static void main(String[] args) throws IOException {

        // 2, 1, 3,4 분면을 돌면서 압축시도
        // 한 사분면에서 새로운 사분면으로 분할해야할 때 괄호가 열고 닫힌다

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        image = new int[N][N];

        for (int i = 0; i < N; i++) {

            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                image[i][j] = Integer.parseInt(String.valueOf(s.charAt(j)));
            }

        }

        StringBuilder sb = new StringBuilder();

        compress(0, 0, N, sb);

        System.out.println(sb);

    }

    private static void compress(int row, int col, int size, StringBuilder sb) {

        if (checkQuadrant(row, col, size)) {
            int color = image[row][col];
            if(color == WHITE){
                sb.append("0");
            } else {
                sb.append("1");
            }
            return;
        }

        size = size / 2;

        sb.append("(");

        compress(row, col, size, sb);
        compress(row, col + size, size, sb);
        compress(row + size, col, size, sb);
        compress(row + size, col + size, size, sb);

        sb.append(")");
    }

    private static boolean checkQuadrant(int row, int col, int size) {

        int color = image[row][col];

        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (image[i][j] != color) {
                    return false;
                }
            }
        }
        return true;
    }

}
