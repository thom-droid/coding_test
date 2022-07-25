package ps.baekjun.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bruteforce14500 {

    static int N, M;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static boolean[][] visited;
    static int[][] map;
    static int[][] board;

    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        //TODO backtracking(dfs), bruteforce

        // populate
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        board = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                visited[i][j] = true;
                board[i][j] = 1;
                backtrack(i, j, 1, map[i][j]);
                visited[i][j] = false;
                board[i][j] = 0;
            }
        }

        System.out.println(max);
    }

    private static void backtrack(int row, int col, int depth, int curSum) {

        // when depth is 4, compare and return
        if (depth == 4) {
            max = Math.max(max, curSum);
            return;
        }

        for (int k = 0; k < 4; k++) {
            // up, down, right, left
            int curRow = row + dx[k];
            int curCol = col + dy[k];

            // in case the pointer goes outside the map
            if (curRow < 0 || curCol < 0 || curRow >= N || curCol >= M) {
                continue;
            }

            // backtracking
            if (!visited[curRow][curCol]) {

                if (depth == 2) {
                    visited[curRow][curCol] = true;
                    board[curRow][curCol] = 1;
                    backtrack(row, col, depth + 1, curSum + map[curRow][curCol]);
                    visited[curRow][curCol] = false;
                    board[curRow][curCol] = 0;

                }

                visited[curRow][curCol] = true;
                board[curRow][curCol] = 1;
                backtrack(curRow, curCol, depth + 1, curSum + map[curRow][curCol]);
                visited[curRow][curCol] = false;
                board[curRow][curCol] = 0;
            }
        }
    }
}
