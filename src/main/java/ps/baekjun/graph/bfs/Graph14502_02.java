package ps.baekjun.graph.bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Graph14502_02 {

    private static final int WALL = 1;
    private static final int VIRUS = 2;
    private static final int EMPTY = 0;

    private static final int[] dx = {0, 0, -1, 1};
    private static final int[] dy = {-1, 1, 0, 0};

    private static int[][] lab;
    private static boolean[][] visited;
    private static int count = Integer.MIN_VALUE;
    private static final LinkedList<int[]> virus = new LinkedList<>();

    public static void main(String[] args) {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String readline = readline(bufferedReader);
        StringTokenizer st = new StringTokenizer(readline, " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        lab = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String line = readline(bufferedReader);
            st = new StringTokenizer(line, " ");
            for (int j = 0; j < M; j++) {
                lab[i][j] = Integer.parseInt(st.nextToken());
                visited[i][j] = false;
                if (lab[i][j] == VIRUS) {
                    visited[i][j] = true;
                    virus.add(new int[]{i, j});
                }
            }
        }

        int wall = 3;
        recursive(wall);

        System.out.println(count);
    }

    private static void recursive(int wall) {
        if (wall == 0) {
            spread();
            count = Math.max(countSafe(), count);
            setup();
            return;
        }

        for (int i = 0; i < lab.length; i++) {
            for (int j = 0; j < lab[i].length; j++) {
                if (lab[i][j] == EMPTY) {
                    lab[i][j] = WALL;
                    recursive(wall - 1);
                    lab[i][j] = EMPTY;
                }
            }
        }
    }

    private static void setup() {
        for (int i = 0; i < lab.length; i++) {
            for (int j = 0; j < lab[i].length; j++) {
                visited[i][j] = false;
                if (lab[i][j] == VIRUS) {
                    visited[i][j] = true;
                    virus.add(new int[]{i, j});
                }
            }
        }
    }

    private static void spread() {
        while (!virus.isEmpty()){
            int[] next = virus.poll();
            int x = next[0];
            int y = next[1];
            for (int i = 0; i < dx.length; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx < 0 || ny < 0 || nx >= lab.length || ny >= lab[0].length) continue;
                if (lab[nx][ny] == EMPTY && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    virus.add(new int[]{nx, ny});
                }
            }
        }
    }

    private static int countSafe() {
        int count = 0;
        for (int i = 0; i < lab.length; i++) {
            for (int j = 0; j < lab[i].length; j++) {
                if (lab[i][j] == EMPTY && !visited[i][j]) {
                    count++;
                }
            }
        }
        return count;
    }

    private static String readline(BufferedReader bufferedReader) {
        try {
            return bufferedReader.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        throw new IllegalArgumentException("no input.");
    }
}
