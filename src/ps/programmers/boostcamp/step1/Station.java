package ps.programmers.boostcamp.step1;

public class Station {

    public int solution(int n, int[] stations, int w) {

        int count = 0;
        int unitRange = 2 * w + 1;
        int reach = 1;

        for (int station : stations) {

            int distanceToStation = station - w;
            int nextStart = station + w + 1;

            while (distanceToStation > reach) {
                count++;
                reach += unitRange;
            }

            reach = nextStart;
        }

        while (n >= reach) {
            count++;
            reach += unitRange;
        }

        return count;

    }


    public int failedSolution(int n, int[] stations, int w) {

        // 기존 설치되어 있는 위치를 확인, 거기 까지 잘라서 w로 나눠서 몇개가 필요한지 세고, 이것을 반복
        // 기지국 하나 당 커버 가능한 범위

        int[] apartment = new int[n + 1];
        int count = 0;

        for (int station : stations) {

            int start = station - w;
            int end = station + w;

            if (end >= apartment.length - 1) {
                end = apartment.length - 1;
            }

            for (int i = start; i <= end; i++) {

                apartment[i] = 1;

            }
        }

        for (int i = 1; i < apartment.length; i++) {
            if (apartment[i] == 0) {
                count++;
                i += 2 * w;
            }
        }

        return count;
    }

}
