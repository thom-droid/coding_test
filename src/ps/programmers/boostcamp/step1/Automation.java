package ps.programmers.boostcamp.step1;

public class Automation {

    public int solution(int[][] cost, int[][] order) {
        int answer = 0;
        return answer;
    }

    public int solution2(int[][] cost, int[][] order) {
        int maxMonth = 0;
        for (int[] o : order) {
            maxMonth = Math.max(o[0], maxMonth);
        }

        // 필요한 월까지의 배열을 만듬. 배열의 인덱스는 월을 표현하고 값은 필요한 생산대수를 의미
        // [0, 50, 50, 50 ...] -> 2월 50, 3월 50, 4월 50..
        int need = 0;
        int[] monthlyOrder = new int[maxMonth];

        for (int[] o : order) {
            // 같은 월이 있을 수도 있다고 했으므로, += 연산을 하여 중복 월을 처리
            monthlyOrder[o[0] - 1] += o[1];
            need += o[1];
        }

        int made = 0;
        int charge = 0;

        for (int i = 0; i < cost.length - 1; i++) {
            if (need == 0 || made >= need) {
                break;
            }
            // 누진 구간 및 구간별 가격
            int limit = cost[i + 1][0] - cost[i][0];
            int price = cost[i][1];
            int rest = 0;

            for (int j = 0; j < monthlyOrder.length; j++) {
                if (need == 0 || made >= need) {
                    break;
                }

                // 누진 구간 내에서 생산하는 것이 가장 저렴하므로, 남은 생산량과 비교해서 해당 수량만큼만 만듬
                // 해당월에 출고수량이 없다면, 저렴한 구간만큼 만들어 놓으면 됨
                // 이 때 생산한 수량을 저장해두었다가, 출고해야 하는 월에 더해서 출고시키면 됨
                int produce = Math.min(need - made, limit);

                // 발생한 비용을 더하고 생산량에 더해줌
                charge += produce * price;
                made += produce;
                need -= monthlyOrder[j];

                if (monthlyOrder[j] == 0) continue;

                // 출고일이라면 지금까지 만들어놓은 생산량을 빼줌
                int delivery = Math.min(made, monthlyOrder[j]);
                made -= delivery;
                monthlyOrder[j] -= delivery;
                rest += monthlyOrder[j];

            }

            need = rest;
            made = 0;

        }

        charge += cost[cost.length - 1][1] * need;
        return charge;
    }
}
