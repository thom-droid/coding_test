package ps.baekjun.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Graph2178_Revision {

    private static int R;
    private static int C;
    private static int[][] graph;

    private static LinkedList<Node> queue;
    private static boolean[][] visited;

    private static int result;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] rowCol = br.readLine().split(" ");
        int row = Integer.parseInt(rowCol[0]);
        int col = Integer.parseInt(rowCol[1]);

        graph = new int[row + 1][col + 1];
        R = row + 1;
        C = col + 1;

        for (int r = 1; r < row + 1; r++) {
            String s = br.readLine();
            for (int c = 0; c < col; c++) {
                int val = Integer.parseInt(String.valueOf(s.charAt(c)));
                graph[r][c + 1] = val;
            }
        }

        bfs();
        System.out.println(result);
    }
    private static void bfs() {

        // 인접 정점을 상하좌우의 정점이라고 간주, 각 인접 정점을 방문하면서 원점으로부터 거리를 저장
        queue = new LinkedList<>();

        visited = new boolean[R][C];
        Node setup = new Node(new int[]{0, 0}, 0, null);
        Node first = new Node(new int[]{1, 1}, 0, setup);
        queue.push(first);

        while (queue.size() != 0) {

            Node next = queue.poll();
            int x = next.coordinates[0];
            int y = next.coordinates[1];
            next.distance = next.prev.distance + 1;

            if (x == R - 1 && y == C - 1 && !visited[x][y]) {
                result = next.distance;
            } else if (x == R - 1 && y == C - 1 && visited[x][y]) {
                result = Math.min(result, next.distance);
            }
            visited[x][y] = true;

            // 1,1 -> 0,1  2,1, 1,0  1,2
            push(createValidNodeFrom(x - 1, y, next));
            push(createValidNodeFrom(x, y + 1, next));
            push(createValidNodeFrom(x + 1, y, next));
            push(createValidNodeFrom(x, y - 1, next));

        }
    }

    private static boolean isOutOfBoundary(int x, int y) {
        return x < 0 || y < 0 || x > R - 1 || y > C - 1;
    }

    private static boolean isValid(int x, int y) {
        return graph[x][y] == 1;
    }

    private static Node createValidNodeFrom(int x, int y, Node prev) {
        if (!isOutOfBoundary(x, y) && isValid(x, y) && !visited[x][y]) {
            if (x != R - 1 && y != C - 1) {
                visited[x][y] = true;
            }
            return new Node(new int[]{x,y}, 0, prev);
        }

        return null;
    }

    private static void push(Node newNode) {
        if (newNode != null) {
            queue.add(newNode);
        }
    }

    static class Node{

        int[] coordinates;
        int distance;

        Node prev;
        public Node(int[] coordinates, int distance, Node prev) {
            this.coordinates = coordinates;
            this.distance = distance;
            this.prev = prev;
        }
    }
}
