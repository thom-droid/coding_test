package ps.programmers.warmups;

public class MineArea {

    private static final int NORMAL_AREA = 0;
    private static final int MINE = 1;
    private static final int DANGER_AREA = 2;

    public int solution(int[][] board) {
        int size = board.length;
        boolean[][] visited = new boolean[size][size];

        int answer = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == MINE && !visited[i][j]) {
                    answer += verifyArea(board, visited, i, j);
                }
            }
        }

        return size * size - answer;
    }

    private int verifyArea(int[][] board, boolean[][] visited, int x, int y) {

        if (x >= board.length || y >= board.length || x < 0 || y < 0) {
            return 0;
        }

        if (board[x][y] == DANGER_AREA || visited[x][y]) {
            return 0;
        }

        if (board[x][y] == NORMAL_AREA) {
            board[x][y] = DANGER_AREA;
            visited[x][y] = true;
            return 1;
        }

        if (board[x][y] == MINE) {
            visited[x][y] = true;
            return 1 + verifyArea(board, visited, x - 1, y) + verifyArea(board, visited, x - 1, y + 1)
                    + verifyArea(board, visited, x, y + 1) + verifyArea(board, visited, x + 1, y + 1)
                    + verifyArea(board, visited, x + 1, y) + verifyArea(board, visited, x + 1, y - 1)
                    + verifyArea(board, visited, x, y - 1) + verifyArea(board, visited, x - 1, y - 1);
        }

        return 0;

    }
}
