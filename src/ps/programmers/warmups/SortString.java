package ps.programmers.warmups;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SortString {

    public static void main(String[] args) {
        System.out.println(solution("Bcad"));
    }

    private static String solution(String my_string) {
        return Arrays.stream(my_string.split(""))
                .map(String::toLowerCase)
                .sorted()
                .collect(Collectors.joining());
    }
}
