package ps.baekjun.graph.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

//silver 1
public class Graph2667 {

    static int N;
    static int[][] graph;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        graph = new int[N][N];
        visited = new boolean[N][N];
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            String s = br.readLine();

            for (int j = 0; j < N; j++) {
                graph[i][j] = Integer.parseInt(String.valueOf(s.charAt(j)));
            }
        }

        int buildingNumber = 1;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {

                int count = 0;
                LinkedList<Node> queue = new LinkedList<>();

                if (graph[i][j] == 1 && !visited[i][j]) {
                    Node node = new Node(i, j);
                    queue.push(node);
                    count = bfs(queue, buildingNumber);

                    if (count > 0) {
                        priorityQueue.add(count);
                        buildingNumber++;
                    }
                }

            }
        }

        Arrays.stream(graph).forEach(x -> System.out.println(Arrays.toString(x)));
        System.out.println(buildingNumber - 1);
        while (priorityQueue.size() != 0) {
            System.out.println(priorityQueue.poll());
        }
    }

    private static int bfs(LinkedList<Node> queue, int buildingNumber) {
        int count = 0;

        while (queue.size() != 0) {
            Node next = queue.poll();
            int x = next.x;
            int y = next.y;
            visited[x][y] = true;
            graph[x][y] = buildingNumber;
            count++;

            for (int i = 0; i < dx.length; i++) {
                int xValue = x + dx[i];
                int yValue = y + dy[i];

                // check if outside the board
                if (xValue >= N || yValue >= N || xValue < 0 || yValue < 0) {
                    continue;
                }

                if (graph[xValue][yValue] == 1 && !visited[xValue][yValue]) {
                    visited[xValue][yValue] = true;
                    queue.push(new Node(xValue, yValue));
                }
            }
        }
        return count;
    }
    private static class Node {
        int x;
        int y;
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}
