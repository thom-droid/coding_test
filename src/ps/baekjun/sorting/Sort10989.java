package ps.baekjun.sorting;

import java.io.*;

//silver 5
public class Sort10989 {

    private static void countingSort(int[] data) throws IOException {

        int size = data.length;
        int[] result = new int[size];
        int[] count = new int[10001];

        for (int datum : data) {
            count[datum]++;
        }

        // accumulation
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        for (int i = data.length - 1; i >= 0; i--) {
            int index = count[data[i]]--;
            result[index - 1] = data[i];
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        for (int i : result) {
            sb.append(i).append('\n');
        }

        bw.write(sb.toString());
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] data = new int[N];

        for (int i = 0; i < N; i++) {
            data[i] = Integer.parseInt(br.readLine());
        }

        countingSort(data);

    }
}
