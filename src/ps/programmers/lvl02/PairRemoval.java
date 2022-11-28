package ps.programmers.lvl02;

import java.util.LinkedList;

public class PairRemoval {

    public int solution(String s)
    {

        if (s.length() % 2 == 1) {
            return 0;
        }

        StringBuilder sb = new StringBuilder(s);

        while (sb.length() > 0) {

            int size = sb.length();

            for (int i = sb.length() - 1; i >= 1; i--) {

                if (sb.charAt(i) == sb.charAt(i - 1)) {
                    sb.delete(i - 1, i + 1);
                    i--;
                }
            }

            if (size == sb.length()) {
                return 0;
            }
        }

        return 1;
    }

    public int solution2(String s) {

        if (s.length() % 2 == 1) {
            return 0;
        }

        LinkedList<Character> stack = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }
}
