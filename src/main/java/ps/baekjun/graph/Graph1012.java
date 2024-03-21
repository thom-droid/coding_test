package ps.baekjun.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Graph1012 {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(readLine(br));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int result = new Land(br).explore().getResult();
            sb.append(result).append("\n");
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }

    public static class Land {

        private int row;
        private int col;
        private int k;
        private final int[] dx = {0, 0, -1, 1};
        private final int[] dy = {-1, 1, 0, 0};
        private BufferedReader br;
        private int[][] land;
        private boolean[][] visited;

        private Area area = new Area();
        private final List<Area> areas = new ArrayList<>();

        public Land(BufferedReader br) {
            this.br = br;
            initSize();
            initLand();
            initVisited();
        }

        public Land explore() {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    Spot start = new Spot(i, j);
                    if (isNotValid(start)) continue;
                    visit(start);
                    LinkedList<Spot> queue = new LinkedList<>();
                    queue.offer(start);
                    area.addCount();
                    area.addSpot(start);
                    while (!queue.isEmpty()) {
                        Spot spot = queue.poll();
                        int x = spot.getX();
                        int y = spot.getY();
                        for (int k = 0; k < 4; k++) {
                            int nx = x + dx[k];
                            int ny = y + dy[k];
                            Spot next = new Spot(nx, ny);
                            if (isNotValid(next)) continue;
                            visit(next);
                            queue.offer(next);
                            area.addCount();
                            area.addSpot(next);
                        }
                    }
                    areas.add(area);
                    area = new Area();
                }
            }
            return this;
        }

        public int getResult() {return areas.size();}

        private void initSize() {
            String[] split = readLine(br).split(" ");
            row = Integer.parseInt(split[0]);
            col = Integer.parseInt(split[1]);
            k = Integer.parseInt(split[2]);
        }

        private void initLand() {
            land = new int[row][col];
            for (int i = 0; i < k; i++) {
                String[] split = readLine(br).split(" ");
                int x = Integer.parseInt(split[0]);
                int y = Integer.parseInt(split[1]);
                land[x][y] = 1;
            }
        }

        private void initVisited() {
            visited = new boolean[row][col];
        }

        private boolean isNotValid(Spot spot) {
            return isOutOfBoundary(spot) || visited(spot) || isNotSpot(spot);
        }

        private boolean isOutOfBoundary(Spot spot) {
            return spot.x < 0 || spot.x >= row || spot.y < 0 || spot.y >= col;
        }

        private boolean visited(Spot spot) {return visited[spot.getX()][spot.getY()];}

        private boolean isNotSpot(Spot spot) {return land[spot.x][spot.y] == 0;}

        private void visit(Spot spot) {visited[spot.getX()][spot.getY()] = true;}

        private boolean yetVisited (Spot spot) {return !visited[spot.getX()][spot.getY()];}
    }

    public static class Spot {
        private final int x;
        private final int y;
        private boolean visited;

        public Spot(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public boolean visited() {return visited;}
        public void setVisited() {visited = true;}

        public int getX() {return x;}
        public int getY() {return y;}
    }

    public static class Area {
        private int count;
        private final List<Spot> spots = new ArrayList<>();

        public void addCount() {count++;}

        public void addSpot(Spot spot) {spots.add(spot);}

        public int getCount() {return count;}
    }

    public static String readLine(BufferedReader br) {
        try {
            return br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        throw new IllegalArgumentException("no input.");
    }
}
