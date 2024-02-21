package ps.programmers.boostcamp.step2;

import java.util.HashMap;
import java.util.Map;

public class Camouflage {

    public int solution(String[][] clothes) {

        // 옷은 종류별로 입을 수 있고 최소 한 개 이상 입는다고 했으므로 한개만 입는 경우부터 생각해보자.
        // 두 개 이상의 조합은 곱하면 된다.
        // 예를 들어 모자 2 바지 2 안경 1 이면
        // 한개만 입는 경우 2, 바지만 2, 안경 1  = 5
        // 두 개만 입는 경우 모자 x 바지 = 4, 모자 x 안경 = 2, 바지 x 안경 = 2 므로 총 8
        // 세개 모두 입는 경우 2x 2 x 1 = 4 모두 더하면 17

        // 맵에 옷 종류별로 카운트만 한 뒤 산술을 하면 될 것 같다.
        int answer = 1;
        Map<String, Integer> map = new HashMap<>();

        for (String[] clothe : clothes) {
            map.put(clothe[1], map.getOrDefault(clothe[1], 0) + 1);
        }



        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            answer *= entry.getValue() + 1;

        }

        return answer - 1;
    }


}
