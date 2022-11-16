package ps.programmers.warmups;

public class SafeZone {

    private static final int MINE = 1;
    private static final int DANGERED_AREA = 2;

    public int solution(int[][] board) {

        int size = board.length;
        int count = 0;
        boolean[][] visited = new boolean[size][size];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == MINE && !visited[i][j]) {
                    visited[i][j] = true;
                    count += measureArea(board, i, j);
                }
            }
        }

        return size * size - count;
    }

    public int measureArea(int[][] board, int x, int y) {

        if (x >= board.length || y >= board.length || x < 0 || y < 0) {
            return 0;
        } else if (board[x][y] == DANGERED_AREA) {
            return 0;
        }
        board[x][y] = DANGERED_AREA;
        return 1 + measureArea(board, x - 1, y) + measureArea(board, x - 1, y - 1)
                + measureArea(board, x, y - 1) + measureArea(board, x + 1, y - 1)
                + measureArea(board, x + 1, y) + measureArea(board, x + 1, y + 1)
                + measureArea(board, x, y + 1) + measureArea(board, x - 1, y + 1);

    }
}
