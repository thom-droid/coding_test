package ps.baekjun.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Rope {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int max_weight = 0;

        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        max_weight = arr[n-1];

        for(int i = 0; i < n-1; i++){
            if(arr[i] > max_weight){
                max_weight = arr[i];
            } else if (arr[i]*(n-i) > max_weight) {
                max_weight = arr[i]*(n-i);
            }

        }

        System.out.println(max_weight);

    }
    // 다른 사람 풀이 Math.max()를 이용해서 품

    private static int numberOfRope;
    private static int maxWeight;
    private static int[] ropes;

    public static void solution() {

        for (int i = 0; i < numberOfRope; i++) {
            maxWeight = Math.max(maxWeight, ropes[i] * (numberOfRope - i));
        }
    }
}
