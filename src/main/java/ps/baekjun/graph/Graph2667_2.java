package ps.baekjun.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Graph2667_2 {

    public static void main(String[] args) {
        new Graph().bfs().printResult();
    }

    public static class Graph {
        private int n;
        private final BufferedReader br;

        private District district = new District(1);
        private final List<District> districts = new ArrayList<>();
        private boolean[][] visited;
        private final int[] dx = {0, 0, -1, 1};
        private final int[] dy = {-1, 1, 0, 0};
        private int[][] graph;

        public Graph() {
            this.br = new BufferedReader(new InputStreamReader(System.in));
            init();
        }

        private void init() {
            initSize();
            initGraph();
            initVisited();
        }

        private Graph bfs() {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (isNotValid(i, j)) continue;
                    districts.add(district);
                    LinkedList<int[]> queue = new LinkedList<>();
                    offerNode(i, j, queue);
                    while (!queue.isEmpty()) {
                        district.addCount();
                        int[] next = queue.poll();
                        int x = next[0];
                        int y = next[1];
                        for (int k = 0; k < 4; k++) {
                            int nx = x + dx[k];
                            int ny = y + dy[k];
                            if (isNotValid(nx, ny)) continue;
                            offerNode(nx, ny, queue);
                        }
                    }
                    district = new District(district.getDistrict() + 1);
                }
            }
            return this;
        }

        public void printResult() {
            StringBuilder sb = new StringBuilder();
            int districtCount = districts.size();
            sb.append(districtCount);
            districts.stream().sorted(Comparator.comparingInt(District::getCount)).forEach(d -> sb.append("\n").append(d.getCount()));
            System.out.println(sb);
        }

        private void initSize() {
            n = Integer.parseInt(readLine());
        }

        private void initGraph() {
            graph = new int[n][n];
            for (int i = 0; i < n; i++) {
                String s = readLine();
                for (int j = 0; j < n; j++) {
                    graph[i][j] = (s.charAt(j)) - '0';
                }
            }
        }

        private void initVisited() {
            visited = new boolean[n][n];
        }

        private String readLine() {
            try {
                return br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            throw new IllegalArgumentException("no input.");
        }

        private void offerNode(int x, int y, LinkedList<int[]> queue) {
            visited[x][y] = true;
            queue.offer(new int[]{x, y});
        }

        private boolean visited(int x, int y) {return visited[x][y];}

        private boolean notRange(int x, int y) { return x < 0 || x >= n || y < 0 || y >= n; }

        private boolean isNotValid(int x, int y) {
            return notRange(x, y) || visited(x, y) || graph[x][y] == 0;
        }
    }

    public static class District {
        private final int district;
        private int count;

        public District(int district) {
            this.district = district;
        }

        public void addCount() {this.count++;}
        public int getCount() {return count;}
        public int getDistrict() {return district;}
    }
}
