package ps.baekjun.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//Bronze 2
public class Sequence1551 {

    private static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        arr = new int[N];

        st = new StringTokenizer(br.readLine(), ",");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        makeNewSequence(K, arr.length);

        sb.append(arr[0]);

        for (int i = 1; i < N - K; i++) {
            sb.append(",").append(arr[i]);
        }

        System.out.println(sb);
    }

    private static void makeNewSequence(int k, int len) {

        if (k == 0) {
            return;
        }

        for (int i = 0; i < len - 1; i++) {
            arr[i] = arr[i + 1] - arr[i];
        }

        makeNewSequence(k - 1, len - 1);

    }
}
