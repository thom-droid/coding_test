package test.programming;

import java.util.Arrays;
import java.util.HashMap;

public class Threshold4 {

    public static void main(String[] args) {

        solution();

    }
    public static void solution(){
        int[] arr = {1,52,125,10,25,201,244,192,128,23,203,98,154,255};
        int[] arr2 = {0,0,255,255,0,0,255,255,255};
        int[] arr3 = {100,50,100,200};

        HashMap<Integer, Integer> map = new HashMap<>(256);

        for(int i = 0; i < 256; i++){
            int left = 0;
            int right = 0;

            for(int j = 0; j < arr.length; j++){
                if(arr[j] >= i){
                    right++;
                } else {
                    left++;
                }
                map.put(i, Math.abs(right - left));
            }

        }

        System.out.println(Arrays.toString(map.values().toArray()));


    }

}
