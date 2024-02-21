package ps.programmers.warmups;

import java.util.StringTokenizer;

public class PickNumbersFromString {

    public int solution(String my_string) {
        String digitRegex = "([1-9]|[1-9][0-9]|[1-9][0-9][0-9]|1000)";
        String letterRegex = "[a-zA-Z]";
        String[] arr = my_string.split(letterRegex);

        int sum = 0;

        for (String s : arr) {
            if (s.matches(digitRegex)) {
                sum += Integer.parseInt(s);
            }
        }
        return sum;
    }

    public int solution2(String my_string) {
        int answer = 0;
        String s = my_string.replaceAll("[^0-9]", " ");
        StringTokenizer st = new StringTokenizer(s, " ");

        while (st.hasMoreTokens()) {
            answer += Integer.parseInt(st.nextToken());
        }

        return answer;
    }

}
