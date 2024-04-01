package ps.baekjun.graph.bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Graph1697_02 {
    public static void main(String[] args) {
        String input = readLine(new BufferedReader(new InputStreamReader(System.in)));
        StringTokenizer s = new StringTokenizer(input, " ");
        int N = Integer.parseInt(s.nextToken());
        int K = Integer.parseInt(s.nextToken());
        int MAX = 100001;
        int[] visited = new int[MAX];

        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(N);
        int[] result = bfs(N, K, visited, queue);
        System.out.println(result[K] - 1);
    }

    public static int[] bfs(int n, int k, int[] visited, LinkedList<Integer> queue) {
        visited[n] = 1;
        while(!queue.isEmpty()) {
            Integer next = queue.poll();
            if (next == k) {
                return visited;
            }

            if (next - 1 >= 0 && visited[next - 1] == 0) {
                visited[next - 1] = visited[next] + 1;
                queue.add(next - 1);
            }

            if (next + 1 < 100001 && visited[next + 1] == 0) {
                visited[next + 1] = visited[next] + 1;
                queue.add(next + 1);
            }

            if (2 * next < 10001 && visited[2 * next] == 0) {
                visited[2 * next] = visited[next] + 1;
                queue.add(2 * next);
            }
        }
        return visited;
    }

    public static String readLine(BufferedReader bufferedReader) {
        try {
            return bufferedReader.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        throw new IllegalArgumentException("no input.");
    }
}
