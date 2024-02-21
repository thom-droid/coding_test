package ps.programmers.lvl01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PickAndAdd {
    public int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length - 1; i++) {

            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        return set.stream().mapToInt(Integer::intValue).sorted().toArray();
    }

    public int[] solution2(int[] numbers) {
        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        return IntStream.range(0, numbers.length - 1).mapToObj(i -> {
            List<Integer> a = list.subList(i, i + 2);
            int val = a.get(0);
            int val2 = a.get(1);
            return val + val2;
        }).mapToInt(Integer::intValue).distinct().sorted().toArray();
    }
}
