package ps.programmers.boostcamp.step2;

import java.util.Arrays;

public class TShirts {

    public int solution(int[] people, int[] tshirts) {

        // 두 배열을 하나씩 비교하면서 같은 경우 카운트를 늘리고, 해당 배열의 원소는 중복처리를 한다.
        // 받을 수 있는 티셔츠는 상의 크기가 티셔츠의 크기가 같거나 커야 하므로 최대한 주려면 큰 셔츠를 큰 상을 받은 사람에게 주는 것이 낫다.
        // 인자의 정렬 상태는 정의된 것이 없으므로 정렬을 하고 시작한다.

        Arrays.sort(people);
        Arrays.sort(tshirts);

        int answer = 0;
        int shirtsIdx = tshirts.length - 1;

        for (int i = people.length - 1; i >= 0; i--) {
            if (shirtsIdx < 0) {
                break;
            }
            if (people[i] <= tshirts[shirtsIdx]) {
                tshirts[shirtsIdx] = 0;
                shirtsIdx--;
                answer++;
            }
        }

        return answer;
    }
}
