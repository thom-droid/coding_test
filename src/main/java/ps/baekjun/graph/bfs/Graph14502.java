package ps.baekjun.graph.bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Graph14502 {

    private static BufferedReader bufferedReader;
    private static int[][] lab;
    private static boolean[][] visited;
    private static LinkedList<int[]> virusQueue = new LinkedList<>();
    private final static LinkedList<int[]> virusBackupQueue = new LinkedList<>();
    private static int N;
    private static int M;
    private final static int[] dx = {0, 0, -1, 1};
    private final static int[] dy = {-1, 1, 0, 0};

    private static final int WALL = 1;
    private static final int VIRUS = 2;
    private static final int EMPTY = 0;

    private static int count = Integer.MIN_VALUE;

    public static void main(String[] args) {

        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(readLine(), " ");
        N = Integer.parseInt(stringTokenizer.nextToken());
        M = Integer.parseInt(stringTokenizer.nextToken());
        lab = new int[N][M];
        visited = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(readLine(), " ");
            for (int j = 0; j < M; j++) {
                lab[i][j] = Integer.parseInt(st.nextToken());
                if (lab[i][j] == VIRUS) {
                    visited[i][j] = true;
                    virusQueue.add(new int[]{i, j});
                    virusBackupQueue.add(new int[]{i, j});
                }
            }
        }
        buildWallAndSpreadVirus(0);
        System.out.println(count);
    }

    private static void buildWallAndSpreadVirus(int wallCount) {
        if (wallCount == 3) {
            spreadVirus();
            countSafeArea();
            resetLab();
            return;
        }

        for (int i = 0; i < lab.length; i++) {
            for (int j = 0; j < lab[i].length; j++) {
                if (lab[i][j] == EMPTY) {
                    lab[i][j] = WALL;
                    buildWallAndSpreadVirus(wallCount + 1);
                    lab[i][j] = EMPTY;
                }
            }
        }
    }

    private static String readLine() {
        try {
            return bufferedReader.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        throw new IllegalArgumentException("no input.");
    }

    private static void spreadVirus() {
        while (!virusQueue.isEmpty()) {
            int[] node = virusQueue.poll();
            int x = node[0];
            int y = node[1];
            visited[x][y] = true;
            for (int i = 0; i < dx.length; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (isNotSpreadable(nx, ny)) continue;
                visited[nx][ny] = true;
                virusQueue.add(new int[]{nx, ny});
            }
        }
    }

    private static void countSafeArea() {
        int safeArea = 0;
        for (int i = 0; i < lab.length; i++) {
            for (int j = 0; j < lab[i].length; j++) {
                if (lab[i][j] == EMPTY && !visited[i][j]) {
                    safeArea++;
                }
            }
        }
        count = Math.max(count, safeArea);
    }

    private static void resetLab() {
        virusQueue = new LinkedList<>(virusBackupQueue);
        visited = new boolean[N][M];
    }

    private static boolean isNotSpreadable(int x, int y) {
        return x < 0 || y < 0 || x >= N || y >= M || visited[x][y] || lab[x][y] == WALL;
    }

}
