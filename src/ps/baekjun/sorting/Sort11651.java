package ps.baekjun.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

// silver 5
public class Sort11651 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] coordination = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            coordination[i][0] = Integer.parseInt(st.nextToken());
            coordination[i][1] = Integer.parseInt(st.nextToken());

        }

        Comparator<? super int[]> comparator = (o1, o2) -> {
            if(o1[1] == o2[1]){
                return o1[0] - o2[0];
            }
            return o1[0] - o2[0];
        };


        Arrays.sort(coordination, comparator);

//        (o1, o2) -> {
//            if(o1[1] == o2[1]){
//                return o1[0] - o2[0];
//            }
//            return o1[1] - o2[1];
//        }

        Arrays.stream(coordination).forEach(a -> {
            System.out.println(a[0] + " "+ a[1]);
        });
    }
}
