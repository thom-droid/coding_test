package ps.baekjun.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Silver 1
public class Graph2178 {
    /*
    * 방문하지 않은 곳 = 1
    * 방문한 곳 1보다 큰 자연수
    * 막다른 곳 0
    * */

    private static final int ROW = 4;
    private static final int COLUMN = 6;

    private static int[][] graph = {
//            {0, 0, 0, 0, 0, 0, 0},
//            {0, 1, 0, 1, 1, 1, 1},
//            {0, 1, 0, 1, 0, 1, 0},
//            {0, 1, 0, 1, 0, 1, 1},
//            {0, 1, 1, 1, 0, 1, 1}
            {0,0,0,0,0,0,0},
            {0,1,1,0,1,1,0},
            {0,1,1,0,1,1,0},
            {0,1,1,1,1,1,1},
            {0,1,1,1,1,0,1}
    };



    public static boolean findPath(int row, int col, int length, int[][] graph) {

        int R = graph.length - 1;
        int C = graph[0].length - 1;
        // graph 밖인 경우
        if (row > R || col > C || row <= 0 || col <= 0) {
            return false;
        }

        // 지나가지 못하는 경우
        if (graph[row][col] == 0) {
            return false;
        }

        // 이미 방문한 곳이라면
        if (graph[row][col] > 1) {
            return false;
        }

        // 목적지라면 리턴
        if (row == R && col == C) {
            length++;
            graph[row][col] = length;
            return true;
        }

        length++;

        graph[row][col] = length;

        return findPath(row, col + 1, length, graph) || findPath(row + 1, col, length, graph)
                || findPath(row, col - 1, length, graph) || findPath(row - 1, col, length, graph);


    }

    public static void main(String[] args) throws IOException {
//        findPath(1, 1, 0);
//        System.out.println(Arrays.deepToString(graph));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] rowCol = br.readLine().split(" ");
        int row = Integer.parseInt(rowCol[0]);
        int col = Integer.parseInt(rowCol[1]);

        int[][] graph = new int[row + 1][col + 1];

        for (int r = 1; r < row + 1; r++) {
            String s = br.readLine();
            for (int c = 0; c < col; c++) {
                int val = Integer.parseInt(String.valueOf(s.charAt(c)));
                graph[r][c + 1] = val;
            }
        }

        System.out.println(Arrays.deepToString(graph));

        findPath(1, 1, 0, graph);

        System.out.println(Arrays.deepToString(graph));
    }

}
