package ps.programmers.lvl01;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class HamburgerMaker {
    public int solution(int[] ingredient) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < ingredient.length; i++) {
            sb.append(ingredient[i]);
        }

        String str = sb.toString();


        int answer = 0;

        while (str.contains("1231")) {
            str = str.replace("1231", "");
            answer++;
        }

        return answer;
    }

    public int solution2(int[] ingredient) {
        int count = 0;

        LinkedList<Integer> queue = new LinkedList<>();
        List<Integer> burger = List.of(1, 2, 3, 1);

        for (int i = 0; i < ingredient.length; i++) {

            queue.add(ingredient[i]);

            if (queue.size() >= 4) {
                List<Integer> sub = queue.subList(queue.size() - 4, queue.size());
                if (sub.equals(burger)) {
                    sub.clear();
                    count++;
                }
            }
        }

        return count;
    }

    private boolean isSequenced(LinkedList<Integer> queue) {

        for (int i = 0; i < queue.size() - 4; i++) {
            if(queue.get(i) == 1 & queue.get(i + 1) == 2 && queue.get(i + 2) == 3 && queue.get(i + 3) == 1)
                return true;
        }

        return false;

    }

    private void remove(LinkedList<Integer> queue, int index) {
        if (index + 4 <= queue.size()) {
            queue.subList(index, index + 4).clear();
        }
    }
}
