package ps.programmers.warmups;

import java.util.Arrays;
import java.util.stream.Stream;

public class PickupNumbers {


    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("12345")));
        System.out.println(Arrays.toString(solution("dasdwjij139dl0jdi2ljf594")));
    }

    private static int[] solution(String my_string) {
        String regex = "\\d";
        return Arrays
                .stream(my_string.split(""))
                .filter(s -> s.matches(regex))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();
    }
}
