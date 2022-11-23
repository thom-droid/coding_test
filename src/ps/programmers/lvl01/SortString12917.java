package ps.programmers.lvl01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class SortString12917 {

    public String solution(String s) {

        return Arrays.stream(s.split("")).sorted(Comparator.reverseOrder()).collect(Collectors.joining());
    }

}
