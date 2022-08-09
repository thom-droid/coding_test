package ps.baekjun.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//Silver2
public class Sorting18870 {

    static int N;
    static int[] array;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        array = new int[N];
        final int[] array2;
        String[] strings = br.readLine().split(" ");

        for (int i = 0; i < strings.length; i++) {
            array[i] = Integer.parseInt(strings[i]);
        }

        StringBuilder sb = new StringBuilder();

        array2 = Arrays.stream(strings).distinct().mapToInt(Integer::parseInt).sorted().toArray();

        for (int i = 0; i < N; i++) {

            for (int j = 0; j < N; j++) {
                if (i == j) {
                    continue;
                }

                if (array[i] > array[j]) {

                }
            }
        }

//        System.out.println(Arrays.toString(result));

    }

//    private
}
