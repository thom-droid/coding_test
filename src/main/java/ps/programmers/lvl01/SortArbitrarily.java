package ps.programmers.lvl01;

import java.util.Arrays;
import java.util.Comparator;

public class SortArbitrarily {

    public Object[] solution(String[] strings, int n) {
        return Arrays.stream(strings).sorted().sorted(Comparator.comparingInt(o -> o.charAt(n))).toArray();
    }

}
