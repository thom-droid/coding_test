package ps.baekjun.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

//silver 1, 9465
public class Stickers {

    private static Integer[][] stickers;
    private static Integer[][] cache;
    private static int[] results;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        results = new int[n];

        for(int i = 0; i < n; i++){
            int len = Integer.parseInt(br.readLine());
            stickers = new Integer[3][len+1];
            cache = new Integer[3][len+1];

            Integer[] a1 = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);
            Integer[] a2 = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);

            for(int j = 1; j <= len; j++){
                stickers[1][j] = a1[j - 1];
                stickers[2][j] = a2[j - 1];
            }

            results[i] = Math.max(bottomUp(2, len), bottomUp(1, len));
        }


        for(int result : results){
            System.out.println(result);
        }
    }

    public static int memoization(int row, int column){

        if(column == 1 || column == 0){
            cache[row][1] = stickers[row][1];
            return cache[row][1];
        }

        if(cache[row][column] == null){
            if(row == 1){
                cache[row][column] = Math.max(memoization(row + 1, column - 2), memoization(row + 1, column - 1)) + stickers[row][column];
            } else if (row == 2){
                cache[row][column] = Math.max(memoization(row - 1, column - 2), memoization(row - 1, column - 1)) + stickers[row][column];
            }

        }

        return cache[row][column];
    }


    public static int bottomUp(int row, int column){

        if(column == 1){
            return stickers[row][column];
        }

        cache[1][1] = stickers[1][1];
        cache[1][2] = stickers[2][1] + stickers[1][2];
        cache[2][1] = stickers[2][1];
        cache[2][2] = stickers[1][1] + stickers[2][2];

        for(int c = 3; c <= column; c++ ){

            for(int r = 1; r <= 2; r++){

                if(r == 1){
                    cache[r][c] = Math.max(cache[r + 1][c - 1], cache[r + 1][c - 2]) + stickers[r][c];
                } else {
                    cache[r][c] = Math.max(cache[r - 1][c - 1], cache[r - 1][c - 2]) + stickers[r][c];
                }

            }

        }

        return cache[row][column];
    }

}
