package practices.programming;

import java.util.Arrays;
import java.util.HashMap;

public class Threshold {

    public static void main(String[] args) {

        int[] arr = {1,52,125,10,25,201,244,192,128,23,203,98,154,255};
        int[] arr2 = {0,0,255,255,0,0,255,255,255};
        int[] arr3 = {100,50,100,200};
        System.out.println(Arrays.stream(arr).sum()/arr.length);
        solution(arr);
        solution(arr2);
        solution(arr3);

    }

    public static int solution(int[] arr){

        Arrays.sort(arr);

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            int threshold = arr[i]+1;

            // 임계값 이상
            int a = 0;

            // 임계값 미만
            int b = 0;

            for(int j = 0; j < arr.length; j++){
                if(arr[j] >= threshold){
                    a++;
                } else {
                    b++;
                }
            }

            int abs = Math.abs(a-b);

            map.computeIfPresent(abs, (k, v) -> {if(v > threshold) v = threshold; return v;});

            map.computeIfAbsent(abs, v -> v = threshold);

        }

        int abs = map.keySet().stream().mapToInt(Integer::intValue).min().getAsInt();


        return map.get(abs);

    }
}
