package ps.programmers.warmups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringChange {

    public int solution(String before, String after) {
        String s1 = Arrays.stream(before.split("")).sorted().collect(Collectors.joining());
        String s2 = Arrays.stream(after.split("")).sorted().collect(Collectors.joining());
        return s1.equals(s2) ? 1 : 0;
    }
}
