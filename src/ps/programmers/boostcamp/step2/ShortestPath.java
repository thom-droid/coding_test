package ps.programmers.boostcamp.step2;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestPath {

    public int solution(int[][] maps) {

        int n = maps.length;
        int m = maps[0].length;

        int[][] visited = new int[n][m];

        Queue<int[]> queue = new LinkedList<>();
        int[] dX = new int[]{-1, 1, 0, 0};
        int[] dY = new int[]{0, 0, -1, 1};

        queue.add(new int[]{0, 0});

        while (!queue.isEmpty()) {

            int[] next = queue.poll();
            int x = next[0];
            int y = next[1];

            for (int k = 0; k < 4; k++) {
                int nx = x + dX[k];
                int ny = y + dY[k];

                // 퍼즐 밖이면
                if (nx< 0 || ny < 0 || nx >= maps.length || ny >= maps[0].length) continue;

                // 좌표가 벽이거나 방문한 경우면
                if (maps[nx][ny] == 0 || visited[nx][ny] != 0) continue;

                // 좌표가 길이거나 방문하지 않은 곳이면
                // 해당 좌표의 거리를 계산하여 저장
                // 좌표를 큐에 추가
                visited[nx][ny] = visited[x][y] + 1;
                queue.add(new int[]{nx, ny});
            }

        }

        return visited[n - 1][m - 1] == 0 ? -1 : visited[n - 1][m - 1] + 1;
    }
}
