package ps.baekjun.geometric;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Geo3009 {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++) {
            String[] split = readLine(bufferedReader).split(" ");
            map.put(split[0], map.getOrDefault(split[0], 0) + 1);
            map2.put(split[1], map2.getOrDefault(split[1], 0) + 1);
        }

        StringBuilder stringBuilder = new StringBuilder();
        map.entrySet().stream().filter(entry -> entry.getValue() == 1).forEach(entry -> stringBuilder.append(entry.getKey()));
        stringBuilder.append(" ");
        map2.entrySet().stream().filter(entry -> entry.getValue() == 1).forEach(entry -> stringBuilder.append(entry.getKey()));
        System.out.println(stringBuilder);
    }

    private static String readLine(BufferedReader bufferedReader) {
        try {
            return bufferedReader.readLine();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
