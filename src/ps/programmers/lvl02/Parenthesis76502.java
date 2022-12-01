package ps.programmers.lvl02;

import java.util.HashMap;
import java.util.LinkedList;

public class Parenthesis76502 {

    public int solution(String s) {

        if (s.length() % 2 == 1 || s.isEmpty()) {
            return 0;
        }

        int answer = 0;
        LinkedList<Character> queue = new LinkedList<>();
        LinkedList<Character> queue2 = new LinkedList<>();
        HashMap<Character, Character> map = new HashMap<>();

        map.put('{', '}');
        map.put('(', ')');
        map.put('[', ']');

        for (int i = 0; i < s.length(); i++) {
            queue2.add(s.charAt(i));
        }

        for (int i = 0; i < s.length(); i++) {

            for (int j = 0; j < s.length(); j++) {

                char left = queue2.poll();
                queue2.add(left);

                if (queue.isEmpty()) {
                    queue.push(left);
                } else {

                    if (map.containsKey(left)) {
                        queue.push(left);
                    } else {

                        char last = queue.peek();
                        if (map.get(last) != null && map.get(last) == left) {
                            queue.pop();
                        }
                    }
                }
            }

            if (queue.isEmpty()) {
                answer++;
            }
            queue.clear();

            // 중간에 break 되면 문자열이 유지되지 않음
            queue2.add(queue2.poll());
        }

        return answer;
    }
}
