package ps.baekjun.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// silver 3
public class Simulation2108 {

    private static int[] data;
    private static int T;

    private static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(br.readLine());

        data = new int[T];

        for (int i = 0; i < T; i++) {
            data[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(data);

    }

    private static void setAverage() {
        double average = Arrays.stream(data).average().orElse(0);
        sb.append(Math.round(average)).append('\n');
    }

    private static void setMedian() {
        sb.append(data[data.length / 2]).append('\n');
    }

    private static void setMode() {
        int[] counting = new int[8001];

        for (int datum : data) {
            counting[datum + 4000]++;
        }

        int max = Arrays.stream(counting).max().orElse(0);

        for (int i = 0; i < counting.length; i++) {
            if (counting[i] == max) {

            }
        }

    }

    private static void setRange() {
        int range = data[data.length - 1] - data[0];
        sb.append(range).append('\n');
    }
}
