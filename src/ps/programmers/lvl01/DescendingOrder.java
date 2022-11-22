package ps.programmers.lvl01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class DescendingOrder {

    public long solution(long n) {
        String s = Arrays.stream(String.valueOf(n).split("")).sorted(Comparator.reverseOrder()).collect(Collectors.joining());

        return Long.parseLong(s);

    }

}
