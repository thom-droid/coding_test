package ps.programmers.lvl02;

import java.util.LinkedList;

public class StockPrice42584 {

    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        // [1,1,1,3,3,3,3,2] 이 있으면 [7, 6, 5, 4, 3, 2, 1, 0]
        // [2,5,5,5,4,4,4,2,3,4,5] -> [10, 3, 2, 1, 3, 2, 1, ]
        // [4,5,5,6,3,2]
        // 스택에 넣어놓고 꺼내면서 앞의 값보다 뒤의 값이 크면 값이 떨어진 것이므로 카운트를 올림
        // 값이 같거나 작으면 그대로 진행

        for (int i = 0; i < prices.length - 1; i++) {

            for (int j = i + 1; j < prices.length; j++) {

                if (prices[i] <= prices[j]) {
                    answer[i]++;
                } else {
                    answer[i]++;
                    break;
                }
            }
        }

        return answer;
    }
}
