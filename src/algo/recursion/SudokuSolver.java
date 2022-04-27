package algo.recursion;

public class SudokuSolver {

    public static void main(String[] args) {
        solveSudoku(board);
        printBoard(board);
    }
    private static final int GRID_SIZE = 9;

    private static int[][] board = {
            {7, 0, 2, 0, 5, 0, 6, 0, 0},
            {0, 0, 0, 0, 0, 3, 0, 0, 0},
            {1, 0, 0, 0, 0, 9, 5, 0, 0},
            {8, 0, 0, 0, 0, 0, 0, 9, 0},
            {0, 4, 3, 0, 0, 0, 7, 5, 0},
            {0, 9, 0, 0, 0, 0, 0, 0, 8},
            {0, 0, 9, 7, 0, 0, 0, 0, 5},
            {0, 0, 0, 2, 0, 0, 0, 0, 0},
            {0, 0, 7, 0, 4, 0, 2, 0, 3}
    };

    public static void printBoard(int[][] board){
        for(int i = 0; i < GRID_SIZE; i++){

            if(i % 3 == 0){
                System.out.println("------------");
            }

            for(int j = 0; j < GRID_SIZE; j++){
                if(j % 3 == 0){
                    System.out.print("|");
                }

                System.out.print(board[i][j]);

            }

            System.out.println("");
        }
    }
    public static boolean isNumberInRow(int[][] board, int row, int number){
        for(int i = 0; i < GRID_SIZE; i++){
            if(board[row][i] == number){
                return true;
            }
        }
        return false;
    }

    public static boolean isNumberInColumn(int[][] board, int column, int number){
        for(int i = 0; i < GRID_SIZE; i++){
            if(board[i][column] == number){
                return true;
            }
        }
        return false;
    }

    public static boolean isNumberInBox(int[][] board, int row, int column, int number){
        // box location
        int localRow = row - row % 3;
        int localColumn = column - column % 3;

        for(int i = localRow; i < localRow + 3; i++){
            for(int j = localColumn; j < localColumn + 3; j++){
                if(board[i][j] == number){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isValidPlacement(int[][] board, int row, int column, int number){
        return !isNumberInRow(board, row, number)
                && !isNumberInColumn(board, column, number)
                && !isNumberInBox(board, row, column, number);
    }

    public static boolean solveSudoku(int[][] board){
        for(int row = 0; row < GRID_SIZE; row++){
            for(int column = 0; column < GRID_SIZE; column++){
                if(board[row][column] == 0){
                    for(int number = 1; number <= GRID_SIZE; number++){
                        if(isValidPlacement(board, row, column, number)){
                            board[row][column] = number;

                            if(solveSudoku(board)){
                                return true;
                            } else {
                                board[row][column] = 0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

}


