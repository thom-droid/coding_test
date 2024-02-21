package ps.programmers.warmups;

import java.util.Arrays;

public class MultiDimensionalArray {

    public int[][] solution(int[] num_list, int n) {
        int len = num_list.length / n;
        int[][] result = new int[len][n];
        int k = 0;
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = num_list[k];
                k++;
            }
        }

        return result;
    }
}
