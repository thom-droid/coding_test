package ps.programmers.lvl02.stack_queue;

import java.util.LinkedList;

public class Parenthesis12909 {

    public boolean solution(String s) {

        if (s.startsWith(")")) {
            return false;
        }

        if (s.length() % 2 == 1) {
            return false;
        }

        LinkedList<String> stack = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            String parenthesis = String.valueOf(s.charAt(i));
            if (parenthesis.equals("(")) {
                stack.push(parenthesis);
            } else {
                if (!stack.isEmpty()) {
                    String peek = stack.peek();
                    if (peek.equals("(")) {
                        stack.pop();
                        continue;
                    }
                }
                stack.push(parenthesis);
            }
        }

        return stack.isEmpty();
    }
}
