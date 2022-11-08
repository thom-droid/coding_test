package ps.programmers.warmups;

import java.util.Arrays;

public class ToLowerToUpper {

    public static void main(String[] args) {
        System.out.println(solution("AbcDEfG"));
    }

    private static String solution(String my_string) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);

            if (c >= 65 && c <= 90) {
                sb.append(String.valueOf(c).toLowerCase());
            } else {
                sb.append(String.valueOf(c).toUpperCase());
            }
        }

        return sb.toString();
    }

}
