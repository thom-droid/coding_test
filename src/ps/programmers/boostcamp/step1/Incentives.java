package ps.programmers.boostcamp.step1;

import java.util.Arrays;

public class Incentives {

    public long solutionThatNotPassedEfficiency(int goal, int[] durations) {

        int time = 0;
        int made = 0;
        int[] output = new int[durations.length];
        int more = 0;

        while (goal > made) {
            time++;

            for (int i = 0; i < durations.length; i++) {

                int d = durations[i];

                if (time % d == 0) {
                    output[i]++;
                    made++;
                }
            }

            if (goal <= made) {
                break;
            }

        }

        int least = Arrays.stream(output).min().orElse(0);

        for (int i : output) {
            more += (i - least);
        }

        return more * 10000L;
    }

    public long solutionWithBinarySearch(int goal, int[] durations) {

        long min = 0;
        int slowest = 0;

        for(int d : durations) slowest = Math.max(slowest, d);

        // 작업자가 평균적으로 만들어야 하는 개수에 가장 느린 사람의 시간을 곱하면
        // 예상할 수 있는 가장 오래 걸리는 시간
        long max = ((goal / durations.length) + 1L) * slowest;

        // 최솟값과 최댓값을 이분탐색으로 최적값을 찾음
        while (min < max) {
            long mid = (min + max) / 2;

            int sum = 0;

            // 해당 초에 각 작업자들이 만든 작업물을 더함
            for (int d : durations) {
                sum += mid / d;
            }

            // 합이 결과치보다 적으면 시간을 올림
            if (sum < goal) {
                min = mid + 1;
            } else {
                max = mid;
            }
        }

        // 구한 시간으로 작업자의 결과물을 구함
        // 그리고 가장 적게 생산한 작업자의 결과물을 구함
        // 추가로 생상된 결과물 개수를 구해서 인센티브 계산
        long least = max / slowest;
        int overProduce = 0;

        for (int duration : durations) {
            overProduce += max / duration - least;
        }

        return overProduce * 10000L;

    }
}
