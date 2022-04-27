package test.programming;

import java.util.Arrays;
import java.util.Comparator;

public class Threshold3 {

    public static void main(String[] args) {
        int[] arr = {1,52,125,10,25,201,244,192,128,23,203,98,154,255};
        solution(arr);

    }

    public static void solution(int[] arr){

            int[][] index_arr = new int [256][2];

            for(int i = 0; i < 256; i++){
                index_arr[i][0] = i;
                int left = 0;
                int right = 0;
                for(int j=0; j < arr.length; j++){
                    if(i <= arr[j]){
                        left++;
                    }else{
                        right++;
                    }
                }
                index_arr[i][1] = Math.abs(left - right);
            }

            Arrays.sort(index_arr, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    if(o1[1] == o2[1]){
                        return o1[0] - o2[0];
                    }
                    return o1[1] - o2[1];
                }
            });

            System.out.println(Arrays.deepToString(index_arr));

    }

}
