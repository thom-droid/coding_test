package algo.recursion;

import java.util.Arrays;

public class Maze {

    private final static int PATHWAY = 0;
    private final static int WALL = 1;
    private final static int BLOCKED = 2;
    private final static int PATH = 3;

    private static int N = 8;
    private static int[][] m = {
            {0,0,0,0,0,0,0,1},
            {0,1,1,0,1,1,0,1},
            {0,0,0,1,0,0,0,1},
            {0,1,0,0,1,1,0,0},
            {0,1,1,1,0,0,1,1},
            {0,1,0,0,0,1,0,1},
            {0,0,0,1,0,0,0,1},
            {0,1,1,1,0,1,0,0}
    };

    public static boolean findPath(int x, int y){

        if(x < 0 || y < 0 || x >= N || y >= N){
            return false;
        } else if(m[x][y] != PATHWAY) {
            return false;
        } else if (x == N - 1 && y == N - 1){
            m[x][y] = PATH;
            return true;
        } else {
            m[x][y] = PATH;
            if(findPath(x,y-1) || findPath(x-1,y) || findPath(x,y+1) || findPath(x+1,y)){
                return true;
            }
            m[x][y] = BLOCKED;
            return false;
        }

    }

    public static void printMaze(){

        for(int i = 0; i < N; i++){
            System.out.println(Arrays.toString(m[i]));
        }

        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        printMaze();
        findPath(0,0);
        printMaze();
    }

}
