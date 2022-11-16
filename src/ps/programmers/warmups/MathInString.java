package ps.programmers.warmups;

import java.util.StringTokenizer;

public class MathInString {

    public int solution(String my_string) {
        String regex = "[a-zA-z]";
        int answer = 0;

        my_string = my_string.replaceAll(regex, "");

        for (int i = 0; i < my_string.length(); i++) {
            answer += Integer.parseInt(String.valueOf(my_string.charAt(i)));
        }

        return answer;
    }

}
