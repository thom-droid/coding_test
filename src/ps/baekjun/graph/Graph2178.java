package ps.baekjun.graph;

import java.util.Arrays;

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
            {0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 1, 1, 1, 1},
            {0, 1, 0, 1, 0, 1, 0},
            {0, 1, 0, 1, 0, 1, 1},
            {0, 1, 1, 1, 0, 1, 1}
    };

    public static boolean findPath(int row, int col, int length) {

        // graph 밖인 경우
        if (row > ROW || col > COLUMN || row <= 0 || col <= 0) {
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
        if (row == ROW && col == COLUMN) {
            length++;
            graph[row][col] = length;
            return true;
        }

        length++;

        graph[row][col] = length;

        return findPath(row, col + 1, length) || findPath(row + 1, col, length)
                || findPath(row, col - 1, length) || findPath(row - 1, col, length);


    }

    public static void main(String[] args) {
        findPath(1, 1, 0);
        System.out.println(Arrays.deepToString(graph));
    }

}
