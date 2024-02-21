package ps.programmers.warmups;

import java.util.Deque;
import java.util.LinkedList;

public class Undo {

    public int solution(String s) {
        int answer = 0;

        String[] clipboard = s.split(" ");
        Deque<Integer> stack = new LinkedList<>();

        for (String s1 : clipboard) {
            if (s1.equals("Z")) {
                answer -= stack.pop();
                continue;
            }
            int val = Integer.parseInt(s1);
            answer += val;
            stack.push(val);
        }


        return answer;
    }
}
