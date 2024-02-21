package ps.baekjun.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

//Silver2
public class Sorting18870 {

    static int N;
    static int[] array;

    static int[] sorted;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        array = new int[N];
        String[] strings = br.readLine().split(" ");

        array = Arrays.stream(strings).mapToInt(Integer::parseInt).toArray();
        sorted = Arrays.stream(strings).distinct().mapToInt(Integer::parseInt).sorted().toArray();

        HashMap<Integer, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < sorted.length; i++) {
            map.put(sorted[i], i);
        }

        for (int i : array) {
            int rank = map.get(i);
            sb.append(rank).append(" ");
        }

        System.out.println(sb);
    }

}
