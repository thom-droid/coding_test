package ps.baekjun.graph.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Graph2178_02 {

    public static void main(String[] args) {
        int result = new Graph().getResult();
        System.out.println(result);
    }

    public static class Graph {
        private int n;
        private int m;
        private int[][] graph;
        private final BufferedReader br;
        private boolean[][] visited;
        private final int[] dx = {0, 0, -1, 1};
        private final int[] dy = {-1, 1, 0, 0};

        public Graph() {
            this.br = new BufferedReader(new InputStreamReader(System.in));
            init();
            bfs();
        }

        private void init() {
            initSize();
            initGraph();
            initVisited();
        }

        private void initSize() {
            String[] split = readLine().split(" ");
            n = Integer.parseInt(split[0]);
            m = Integer.parseInt(split[1]);
        }

        private void initGraph() {
            graph = new int[n][m];
            for (int i = 0; i < n; i++) {
                String s = readLine();
                for (int j = 0; j < m; j++) {
                    graph[i][j] = (s.charAt(j)) - '0';
                }
            }
        }

        private void initVisited() {visited = new boolean[n][m];}

        private String readLine() {
            try {
                return br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            throw new IllegalArgumentException("no input.");
        }

        private void bfs() {
            LinkedList<int[]> queue = new LinkedList<>();
            queue.add(new int[]{0, 0});
            visit(0, 0);

            while(!queue.isEmpty()) {
                int[] coordinate = queue.poll();
                int x = coordinate[0];
                int y = coordinate[1];
                if (reachedEnd(x, y)) break;
                for (int i = 0; i < 4; i++) {
                    int dx = x + this.dx[i];
                    int dy = y + this.dy[i];
                    if (isNotValid(dx, dy)) continue;
                    mark(x, y, dx, dy);
                    visit(dx, dy);
                    queue.add(new int[]{dx, dy});
                }
            }
        }

        private boolean visited(int x, int y) {return visited[x][y];}

        private void visit(int x, int y) {visited[x][y] = true;}

        private void mark(int x, int y, int dx, int dy) {
            graph[dx][dy] = graph[x][y] + 1;
        }

        private boolean reachedEnd(int x, int y) {
            return x == n - 1 && y == m - 1;
        }

        private boolean isNotValid(int x, int y) {
            return (x < 0 || y < 0 || x >= n || y >= m) || graph[x][y] == 0 || visited(x, y);
        }

        public int getResult() {
            return graph[n - 1][m - 1];
        }
    }
}
