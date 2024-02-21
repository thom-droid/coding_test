package ps.programmers.lvl01;

import java.util.ArrayList;
import java.util.LinkedList;

public class CraneGame {

    public int solution(int[][] board, int[] moves) {

        ArrayList<LinkedList<Integer>> dollBox = new ArrayList<>();
        LinkedList<Integer> basket = new LinkedList<>();
        int answer = 0;

        for (int i = 0; i < board.length; i++) {
            LinkedList<Integer> dolls = new LinkedList<>();

            for (int j = board.length - 1; j >= 0; j--) {
                if (board[j][i] == 0) {
                    continue;
                }
                dolls.push(board[j][i]);
            }

            dollBox.add(dolls);
        }

        for (int column : moves) {
            LinkedList<Integer> dolls = dollBox.get(column - 1);
            if (dolls.isEmpty()) {
                continue;
            }

            int doll = dolls.pop();

            if (basket.size() >= 1) {
                if (basket.peek() == doll) {
                    basket.pop();
                    answer += 2;
                    continue;
                }
            }

            basket.push(doll);
        }

        return answer;
    }
}
