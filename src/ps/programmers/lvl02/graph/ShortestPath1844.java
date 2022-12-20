package ps.programmers.lvl02.graph;

import java.util.LinkedList;

public class ShortestPath1844 {

    private static final int WALL = 0;
    private static final int PATH = 1;
    private static final int VISITED = 2;

    private int R;
    private int C;

    private static final int[] dX = {1, -1, 0, 0};
    private static final int[] dY = {0, 0, 1, -1};

    public int solution(int[][] maps) {

        R = maps.length;
        C = maps[0].length;
        boolean[][] visited = new boolean[R][C];
        LinkedList<Integer[]> queue = new LinkedList<>();
        queue.add(new Integer[]{0, 0});
        maps[0][0] = 1;
        visited[0][0] = true;

        boolean reachable = bfs(R, C, maps, queue, visited);

        if (reachable) {
            return maps[R - 1][C - 1];
        }

        return -1;
    }

    private boolean bfs(int row, int col, int[][] map, LinkedList<Integer[]> queue, boolean[][] visited) {

        while (!queue.isEmpty()) {

            Integer[] node = queue.poll();

            int x = node[0];
            int y = node[1];

            for (int i = 0; i < 4; i++) {
                int nX = x + dX[i];
                int nY = y + dY[i];

                if (nX == row - 1 && nY == col - 1) {
                    map[nX][nY] = map[x][y] + 1;
                    return true;
                }

                if (nX >= row || nY >= col || nX < 0 || nY < 0) {
                    continue;
                }

                if (map[nX][nY] == PATH && !visited[nX][nY]) {
                    visited[nX][nY] = true;
                    map[nX][nY] = map[x][y] + 1;
                    queue.add(new Integer[]{nX, nY});
                }

            }

        }

        return false;
    }

    private boolean dfs(int row, int col, int count, int[][] maps) {

        if (row == R - 1 && col == C - 1) {
//            this.count = Math.max(this.count, count);
            return true;
        }

        if (row >= R || row < 0 || col >= C || col < 0) {
            return false;
        }

        if (maps[row][col] == WALL || maps[row][col] == VISITED) {
            return false;
        }

        maps[row][col] = VISITED;

        return dfs(row + 1, col, count + 1, maps) || dfs(row - 1, col, count + 1, maps) ||
                dfs(row, col + 1, count + 1, maps) || dfs(row, col - 1, count + 1, maps);
    }

}
