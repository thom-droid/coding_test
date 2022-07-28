package ps.leet;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ValidParenthesis {

    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("(((())))[]{}"));
        System.out.println(isValid("(]]]{"));
    }

    private static boolean isValid(String s) {

        LinkedList<String> stack = new LinkedList<>();
        Map<String, String> hashMap = new HashMap<>();
        String leftParenthesis = "([{";
        hashMap.put("(", ")");
        hashMap.put("[", "]");
        hashMap.put("{", "}");

        for (int i = 0; i < s.length(); i++) {
            String parenthesis = String.valueOf(s.charAt(i));

            if (leftParenthesis.contains(parenthesis)) {
                stack.push(parenthesis);
            } else {
                if (stack.size() != 0) {
                    String storedParenthesis = stack.pop();
                    if (!parenthesis.equals(hashMap.get(storedParenthesis))) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
