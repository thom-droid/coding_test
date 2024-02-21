package ps.programmers.warmups;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class StringManipulation {

    public int solution(String A, String B) {
        LinkedList<String> queue = Arrays.stream(A.split("")).collect(Collectors.toCollection(LinkedList::new));
        for (int i = 0; i <= queue.size(); i++) {

            String s = String.join("", queue);

            if (s.equals(B)) {
                return i;
            }

            queue.push(queue.pollLast());

        }

        return -1;
    }
}
