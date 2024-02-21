package ps.baekjun.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//silver 5, 2751
// parallel sort(merge), quick sort is not allowed here (timeout)
public class Sort2751 {

    public static void main(String[] args) throws IOException {
        sortWithCountingSort();
    }

    private static void sortWithAPI() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);

        StringBuilder sb = new StringBuilder();

        for (Integer integer : list) {
            sb.append(integer).append('\n');
        }

        System.out.println(sb);
    }

    private static void sortWithCountingSort() throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // input data ranges from - 1000000 to 1000000
        // suppose 1000000 is 0 index
        boolean[] arr = new boolean[2000001];

        for (int i = 0; i < N; i++) {
            arr[Integer.parseInt(br.readLine()) + 1000000] = true;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]) {
                sb.append(i - 1000000).append('\n');
            }
        }

        System.out.println(sb);

    }
}
