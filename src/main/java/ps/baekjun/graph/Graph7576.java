package ps.baekjun.graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Graph7576 {

    private final static int[] dx = {0, 0, -1, 1};
    private final static int[] dy = {-1, 1, 0, 0};
    private static boolean[][] visited;
    private static int[][] box;

    private static final int NOT_RIPE = 0;
    private static final int RIPE = 1;
    private static final int EMPTY = -1;

    private static int count = -1;

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(readLine(br), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        box = new int[M][N];
        visited = new boolean[M][N];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(readLine(br), " ");
            for (int j = 0; j < N; j++) {
                box[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        LinkedList<int[]> queue = new LinkedList<>();

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (isRipe(i, j)) {
                    visit(i, j);
                    queue.offer(new int[]{i, j});
                }
            }
        }

        LinkedList<int[]> queue2 = new LinkedList<>();

        while (!queue.isEmpty()) {
            bfs(queue, queue2);
            queue = queue2;
            queue2 = new LinkedList<>();
        }

        if (isNotFullyRipe(box)) {
            System.out.println(-1);
            return;
        }

        System.out.println(count);
    }

    private static void bfs(LinkedList<int[]> targetQueue, LinkedList<int[]> nextQueue) {
        while (!targetQueue.isEmpty()) {
            int[] node = targetQueue.poll();
            int x = node[0];
            int y = node[1];
            visit(node[0], node[1]);

            for (int k = 0; k < 4; k++) {
                int nextX = x + dx[k];
                int nextY = y + dy[k];
                if (ableToSkip(nextX, nextY)) continue;
                makeRipe(nextX, nextY);
                visit(nextX, nextY);
                nextQueue.offer(new int[]{nextX, nextY});
            }
        }
        count++;
    }

    public static boolean isNotFullyRipe(int[][] box) {
        for (int[] row : box) {
            for (int i : row) {
                if (i == NOT_RIPE) return true;
            }
        }
        return false;
    }

    private static String readLine(BufferedReader br) {
        try {
            return br.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        throw new IllegalArgumentException("empty or invalid input.");
    }

    public static void visit(int x, int y) {
        visited[x][y] = true;
    }

    public static boolean isOutOfBoundary(int x, int y) {
        return x < 0 || y < 0 || x >= box.length || y >= box[0].length;
    }

    public static boolean isNotVisited(int x, int y) {
        return !visited[x][y];
    }

    public static boolean isVisited(int x, int y) {
        return visited[x][y];
    }

    public static boolean ableToSkip(int x, int y) {
        return isOutOfBoundary(x, y) || isVisited(x, y) || doesNotSpread(x, y) || isRipe(x, y);
    }

    public static boolean ableToStart(int x, int y) {
        return isNotVisited(x, y) && isRipe(x, y);
    }

    public static boolean doesNotSpread(int x, int y) {
        return box[x][y] == EMPTY;
    }

    public static boolean isNotRipe(int x, int y) {
        return box[x][y] == NOT_RIPE;
    }

    public static boolean isRipe(int x, int y) {
        return box[x][y] == RIPE;
    }

    public static void makeRipe(int x, int y) {
        box[x][y] = RIPE;
    }
}
