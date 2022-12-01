package ps.programmers.lvl02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;


public class Tuple64065 {

    public int[] solution(String s) {

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        Arrays
                .stream(s.substring(2, s.length() - 2).split("},\\{"))
                .sorted(Comparator.comparingInt(String::length))
                .forEach(s1 ->
                        Arrays.stream(s1.split(",")).mapToInt(Integer::parseInt).forEach(set::add)
                );


        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}
