package ps.programmers.warmups;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ChangeIndex {

    public static void main(String[] args) {
//        System.out.println(solution("abcde", 1, 3));
        System.out.println(solution("I love you", 3, 6));
        System.out.println(solution2("I love you", 3, 6));
    }

    private static String solution(String my_string, int num1, int num2) {
        StringBuilder sb = new StringBuilder(my_string);

        sb.setCharAt(num2, my_string.charAt(num1));
        sb.setCharAt(num1, my_string.charAt(num2));

        return sb.toString();
    }

    private static String solution2(String my_string, int num1, int num2) {
        List<String> stringList = Arrays.stream(my_string.split("")).collect(Collectors.toList());

        Collections.swap(stringList, num1, num2);
        return String.join("", stringList);
    }
}
