package algo.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Reversed {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long N = Long.parseLong(br.readLine());

        long[] arr = new long[(int) N];

        for(int i = 0; i < arr.length; i++){
            arr[i] = Long.parseLong(br.readLine());
        }

        Arrays.sort(arr);

        Arrays.stream(arr).forEach(System.out::println);
    }
}
