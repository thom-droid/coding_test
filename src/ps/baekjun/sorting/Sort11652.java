package ps.baekjun.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

//Silver 4
public class Sort11652 {
    private static long getLargestNumber(HashMap<Long, Integer> hashMap) {

        // loop,
        return hashMap.entrySet().stream()
                .max(comparator)
                .get().getKey();
    }
    private static Comparator<Map.Entry<Long, Integer>> comparator = (o1, o2) -> {
        if(o1.getValue().intValue() ==(o2.getValue()).intValue()){
            return  Long.compare(o2.getKey().longValue(), o1.getKey().longValue());
        }
        return o1.getValue().intValue() - o2.getValue().intValue();
    };


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        if (N == 0) {
            System.out.println(0);
            return ;
        }

        HashMap<Long, Integer> map = new HashMap<>();
        while (N-- > 0) {
            long key = Long.parseLong(br.readLine());
            int value = map.getOrDefault(key, 0);
            map.put(key, ++value);
        }

        System.out.println(getLargestNumber(map));

    }
}
