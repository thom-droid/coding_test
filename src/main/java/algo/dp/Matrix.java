package algo.dp;

import java.util.Arrays;

public class Matrix {

    static int[][] table = new int[5][5];
    static int[][] cache = new int[5][5];
    static String[][] path = new String[5][5];

    public static void main(String[] args) {
        table[1] = new int[]{0, 6, 7, 12, 5};
        table[2] = new int[]{0, 5, 3, 11, 18};
        table[3] = new int[]{0, 7, 17, 3, 3};
        table[4] = new int[]{0, 8, 10, 14, 9};
//        System.out.println(mat(3, 3));
//        System.out.println(memoization(3, 3));
//        System.out.println(bottomUp(3,3));
        System.out.println(bottomUpWithPath(4, 4));
        System.out.println(Arrays.deepToString(cache));
        printPath(4,4);
    }

    public static int mat(int i, int j){

        if(i == 1 && j == 1){
            return table[i][j];
        } else if (i == 1){
            return mat(i, j-1) + table[i][j];
        } else if (j == 1){
            return mat(i-1, j) + table[i][j];
        } else {
            return Math.min(mat(i, j-1), mat(i-1, j)) + table[i][j];
        }

    }


    public static int memoization(int i, int j){


        if(cache[i][j] > 0){ // 초기화된 값이 아니라면, 즉 연산이 된 값이 있다면
            return cache[i][j];
        } else if (i == 1 && j == 1){
            cache[i][j] = table[i][j];
        } else if (i == 1){
            cache[i][j] = memoization(i, j-1) + table[i][j];
        } else if (j == 1){
            cache[i][j] = memoization(i-1, j) + table[i][j];
        } else {
            cache[i][j] = Math.min(memoization(i-1, j), memoization(i, j-1)) + table[i][j];
        }

        return cache[i][j];
    }

    public static int bottomUp(int n, int k){

        for(int i = 1; i <= n; i++){

            for(int j = 1; j <=n; j++){

                if(i == 1 && j ==1){
                    cache[i][j] = table[i][j];
                } else if(i == 1){
                    cache[i][j] = cache[i][j-1] + table[i][j];
                } else if(j == 1){
                    cache[i][j] = cache[i-1][j] + table[i][j];
                } else {
                    cache[i][j] = Math.min(cache[i-1][j], cache[i][j-1]) + table[i][j];
                }

            }
        }
        return cache[n][k];
    }

    public static int bottomUpWithPath(int n, int k){

        for(int i = 1; i <= n; i++){

            for(int j = 1; j <=n; j++){

                if(i == 1 && j ==1){
                    cache[i][j] = table[i][j];
                    path[i][j] = "-"; // start
                } else if(i == 1){ // 위쪽은 고정이고, 좌측에서 온다는 뜻
                    cache[i][j] = cache[i][j-1] + table[i][j];
                    path[i][j] = ">>";
                } else if(j == 1){ // 열은 고정이고, 위에서만 내려온다는 뜻
                    cache[i][j] = cache[i-1][j] + table[i][j];
                    path[i][j] = "V";
                } else {
                    if(cache[i-1][j] < cache[i][j-1]){
                        cache[i][j] = cache[i-1][j] + table[i][j];
                        path[i][j] = "V";
                    } else {
                        cache[i][j] = cache[i][j-1] + table[i][j];
                        path[i][j] = ">>";
                    }
                }

            }
        }
        return cache[n][k];
    }


    public static void printPath(int i, int j){
        System.out.println(Arrays.deepToString(path));

        while(!path[i][j].equals("-")){
            System.out.print("( " +i + " " + j + " )");
            if(path[i][j].equals("V")){
                i -= 1;
            } else if (path[i][j].equals(">>")) {
                j -= 1;
            }
        }
        System.out.print("( " +i + " " + j + " )");
    }
}
