package ps.programmers.boostcamp.step1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class GovernmentBudget {

    public int solutionThatNotPassedEfficiencyTest(int[] budgets, int M) {

        // 전체 예산 합이 정부 예산보다 적으면 상한선은 가장 큰 예산과 같다.
        // 아닌 경우
        // 예산이 가장 적은 곳을 상한선으로 한다.
        // 상한선을 올려가며 전체 합을 구하고 전체 예산과 같을 때까지 반복한다.
        // 상한선과 하한선이 같을 때까지 반복하는데, 효율성을 높이고 싶다.
        // 이진탐색을 사용하자.

        int sum = Arrays.stream(budgets).sum();

        if (sum <= M) {
            return Arrays.stream(budgets).max().getAsInt();
        }

        int limit = Arrays.stream(budgets).min().getAsInt();
        int subSum = limit * budgets.length; // 최소값을 상한선으로 잡았을 때의 전체 예산 합

        while (M >= subSum) {

            for (int i = 0; i < budgets.length; i++) {

                int b = budgets[i];

                if (b > limit) {
                    subSum++;
                }

            }

            if (M <= subSum) {
                break;
            }

            limit++;
        }

        return limit;

    }

    public int solution(int[] budgets, int M) {

        int min = 0;
        int max = IntStream.of(budgets).max().orElse(0);
        int answer = 0;

        while (min <= max) {

            int mid = (min + max) / 2;

            int sum = IntStream.of(budgets).map(b -> Math.min(b, mid)).sum();

            if (sum <= M) {
                min = mid + 1;
                answer = mid;
            } else {
                max = mid - 1;
            }
        }

        return answer;

    }

}
