package ps.baekjun.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Silver 4
public class Sort11652 {

    private static int getLargestNumber(HashMap<Long, Integer> hashMap) {

        long largestNumber = 0;
        hashMap.entrySet().stream().max(Comparator.comparingInt(Map.Entry::getValue));

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        HashMap<Long, Integer> map = new HashMap<>();
        while (N-- > 0) {
            long key = Long.parseLong(br.readLine());
            int value = map.getOrDefault(key, 0);
            map.put(key, ++value);
        }
    }
}
