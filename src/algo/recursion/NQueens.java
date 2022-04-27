package algo.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NQueens {

    private static int size;
    private static int[] cols;
    private static int[][] board;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input size");

        size = Integer.parseInt(br.readLine());
        cols = new int[size+1];
        board = new int[size+1][size+1];
        solvable(0);
    }

    public static boolean solvable(int level){

        if(!isPromising(level)){
            return false;
        } else if (level == size){
            for(int i = 1; i < size + 1; i++){
                board[i][cols[i]] = 1;
            }
            System.out.println(Arrays.deepToString(board));
            return true;
        } else {
            for(int i = 1; i <= size; i++){
                cols[level+1] = i;
                if(solvable(level+1)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isPromising(int level){
        for(int i = 1; i <= level -1; i++){
            if(cols[level] == cols[i]){
                return false;
            }

            int abs = Math.abs(cols[level] - cols[i]);
            int height = level - i;

            if(abs == height){
                return false;
            }
        }
        return true;
    }
}
