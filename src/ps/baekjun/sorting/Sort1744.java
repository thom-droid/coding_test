package ps.baekjun.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

//gold 4
public class Sort1744 {

    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        int sum = 0;
        Integer[] positives;
        Integer[] negatives;
        int[] input = new int[N];

        for (int i = 0; i < N; i++) {
            input[i] = Integer.parseInt(br.readLine());
        }

        // 내림차순 (10,9,8..)
        positives = Arrays.stream(input).filter(x -> x > 1).boxed().sorted((o1, o2) -> o2 - o1).toArray(Integer[]::new);

        // 1은 다 더한다.
        sum += Arrays.stream(input).filter(x -> x == 1).count();

        // 오름차순 (-5, -4..)
        negatives = Arrays.stream(input).filter(x -> x <= 0).boxed().sorted().toArray(Integer[]::new);

        if (positives.length % 2 == 0) {
            for (int i = 0; i < positives.length; i += 2) {
                sum += (positives[i] * positives[i + 1]);
            }
        } else { // 5 - 1 = 4, 0,1,2,3
            for (int i = 0; i < positives.length - 1; i += 2) {
                sum += (positives[i] * positives[i + 1]);
            }
            sum += positives[positives.length - 1];
        }

        if (negatives.length % 2 == 0) {
            for (int i = 0; i < negatives.length; i += 2) {
                sum += negatives[i] * negatives[i + 1];
            }
        }else {
            for (int i = 0; i < negatives.length - 1; i += 2) {
                sum += negatives[i] * negatives[i + 1];
            }
            sum += negatives[negatives.length - 1];
        }
        System.out.println(sum);
    }

}
