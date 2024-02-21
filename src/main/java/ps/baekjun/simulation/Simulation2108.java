package ps.baekjun.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

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
        sb = new StringBuilder();

        setAverage();
        setMedian();
        setMode();
        setRange();

        System.out.println(sb);
    }

    private static void setAverage() {
        double average = Arrays.stream(data).average().orElse(0);
        sb.append(Math.round(average)).append('\n');
    }

    private static void setMedian() {
        sb.append(data[data.length / 2]).append('\n');
    }

    private static void setMode() {
        int[][] counting = new int[8001][2];

        for (int i = 0; i < data.length; i++) {
            counting[data[i] + 4000][0] = data[i];
            counting[data[i] + 4000][1]++;
        }

        int max = Arrays.stream(counting)
                .mapToInt(datum -> datum[1])
                .max()
                .orElse(0);

        int[][] result = Arrays.stream(counting)
                .filter(datum -> datum[1] == max)
                .sorted((datum1, datum2) -> datum2[0] - datum1[0]) // descending
                .toArray(int[][]::new);

        if (result.length > 2) {
            sb.append(result[result.length - 2][0]);
        } else {
            sb.append(result[0][0]);
        }

        sb.append('\n');
    }

    private static void setRange() {
        int range = data[data.length - 1] - data[0];
        sb.append(range);
    }
}
