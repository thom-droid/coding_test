package algo.recursion;

public class CountingBlob {

    public static void main(String[] args) {
        System.out.println(countCells(7,1));
    }
    private static int[][] image = {
            {1,0,0,0,0,0,0,1},
            {0,1,1,0,0,1,0,0},
            {1,1,0,0,1,0,1,0},
            {0,0,0,0,0,1,0,0},
            {0,1,0,1,0,1,0,0},
            {0,1,0,1,0,1,0,0},
            {1,0,0,0,1,0,0,1},
            {0,1,1,0,0,1,1,1}
    };

    private static final int GRID_SIZE = image.length;
    private static final int BACKGROUND_PIXEL = 0;
    private static final int IMAGE_PIXEL = 1;
    private static final int COUNTED = 2;

    public static int countCells(int x, int y){

        if(x >= GRID_SIZE || y >= GRID_SIZE || x < 0 || y < 0){
            return 0;
        } else if(image[x][y] != IMAGE_PIXEL){
            return 0;
        } else {
            image[x][y] = COUNTED;
            return 1 + countCells(x-1, y) + countCells(x-1, y+1) +
                    countCells(x, y+1) + countCells(x+1, y+1) +
                    countCells(x+1, y) + countCells(x+1, y-1) +
                    countCells(x, y-1) + countCells(x-1, y-1);
        }
    }
}
