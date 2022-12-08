package ps.programmers.lvl02;

public class DominateLand12913 {

    private int max = 0;

    public int solution2(int[][] land) {

        boolean[][] visited = new boolean[land.length][4];

        backtracking(0, 0, land, visited);

        return max;
    }

    private void backtracking(int depth, int score, int[][] land, boolean[][] visited) {

        if (depth == land.length) {
            max = Math.max(score, max);
            return;
        }

        for (int j = 0; j < 4; j++) {
            if (!visited[depth][j] && !isSameColumn(depth, j, visited)) {
                visited[depth][j] = true;
                backtracking(depth + 1, score + land[depth][j], land, visited);
                visited[depth][j] = false;
            }
        }

    }

    // 같은 열에 있는지 체크
    private boolean isSameColumn(int depth, int col, boolean[][] visited) {

        for (int i = 0; i < depth; i++) {
            if (visited[i][col]) {
                return true;
            }
        }

        return false;
    }

    // 위의 풀이는 잘못되었음. '연속'해서 같은 열을 밟을 수 없을 뿐임.. 문제를 잘 읽어야 함.

    // 해당 문제는 DP로 해결할 수 있음

    public int solution(int[][] land) {

        for (int i = 1; i < land.length; i++) {

            int[] arr = land[i - 1];

            for (int j = 0; j < 4; j++) {

                int max = 0;

                for (int k = 0; k < 4; k++) {

                    if (j == k) {
                        continue;
                    }

                    if (arr[k] >= max) {
                        max = arr[k];
                    }

                }

                land[i][j] += max;
            }
        }

        int[] arr = land[land.length - 1];

        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
        }

        return max;
    }


}
