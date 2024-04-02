package ps.baekjun.condition;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Condition2480 {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] roll = Arrays.stream(readline(bufferedReader).split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
        int num = 0;
        if (roll[0] == roll[1] && roll[1] == roll[2]) {
            num = 10000 + roll[0] * 1000;
        } else if (roll[0] == roll[1] || roll[1] == roll[2]) {
            num = 1000 + roll[1] * 100;
        } else {
            num = roll[2] * 100;
        }
        System.out.println(num);
    }

    public static void main2() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] roll = Arrays.stream(readline(bufferedReader).split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
        int num = 0;
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i : roll) map.put(i, map.getOrDefault(i, 0) + 1);
        if (map.size() == 1) num = 10000 + roll[0] * 1000;
        else if (map.size() == 2) {
            for (int i = 0; i < roll.length; i++) {
                if (map.get(roll[i]) == 2) {
                    num = 1000 + roll[i] * 100;
                    break;
                }
            }
        } else {

        }
    }

    private static String readline(BufferedReader bufferedReader) {
        try {
            return bufferedReader.readLine();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
