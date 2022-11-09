package ps.programmers.warmups;

public class ConcatString {

    public String[] solution(String my_str, int n) {
        int len = my_str.length() / n;

        if (my_str.length() % n != 0) {
            len++;
        }

        String[] result = new String[len];
        int k = 0;

        for (int i = 0; i < my_str.length(); i += n) {
            String el = "";

            if ((i + n) > my_str.length()) {
                el = my_str.substring(i);
            } else {
                el = my_str.substring(i, i + n);
            }
            result[k] = el;
            k++;
        }
        return result;
    }

    public String[] solution2(String my_str, int n) {
        int resultCnt = (my_str.length() + n - 1) / n;
        String[] answer = new String[resultCnt];

        for (int i = 0; i < resultCnt; i++) {
            int start = n * i;
            int end = Math.min(start + n, my_str.length());
            answer[i] = my_str.substring(start, end);
        }

        return answer;
    }
}
