package ps.programmers.lvl02;

import java.util.Arrays;

public class HIndex42747 {

    public int solution(int[] citations) {

        Arrays.sort(citations);

        for (int i = citations.length - 1; i >= 1; i--) {

            // 현재 논문보다 높은 인용 횟수를 가진 논문의 수.
            // 가령 0,1,3,5,6에서 6이 선택됐을 때 i = 5 - 1 = 4 이고 6 이상의 논문(higher)은 citations.length - 4 = 1 개임
            int higher = citations.length - i;

            // citations[2] = 3, 즉 3회 인용된 논문, higher은 이 논문보다 많이 인용된 논문의 수이므로 3
            if (citations[i] <= higher) {
                return i;
            }

        }

        return -1;
    }
}
