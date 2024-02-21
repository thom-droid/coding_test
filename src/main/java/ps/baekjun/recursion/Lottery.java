package ps.baekjun.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Lottery {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (scanner.hasNext()) {
            String line = scanner.nextLine();

            if (line.equals("0")) {
                sb.deleteCharAt(sb.length() - 1);
                sb.deleteCharAt(sb.length() - 1);
                break;
            }

            Integer[] numbers = Arrays.stream(line.split(" "))
                    .skip(1)
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);

            int[] target = new int[6];

            combination(sb, target, numbers, 0, 0, 6);
            sb.append("\n");
        }

        System.out.println(sb);

    }

    private static StringBuilder combination(StringBuilder sb, int[] target, Integer[] numbers, int targetIndex, int depth, int left) {

        if (left == 0) {

            StringBuilder sb1 = new StringBuilder();
            for (int i : target) {
                sb1.append(i);
                sb1.append(" ");
            }
            sb1.deleteCharAt(sb1.length() - 1).append("\n");

            sb.append(sb1);

        } else if (numbers.length == depth) {
            return sb;
        } else {

            target[targetIndex] = numbers[depth];

            // 해당 depth에서 선택하는 경우
            combination(sb, target, numbers, targetIndex + 1, depth + 1, left - 1);

            // 안하는 경우
            combination(sb, target, numbers, targetIndex, depth + 1, left);
        }

        return sb;
    }
}
