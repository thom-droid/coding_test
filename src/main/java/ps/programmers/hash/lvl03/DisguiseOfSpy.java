package ps.programmers.hash.lvl03;


import java.util.*;

import static java.util.stream.Collectors.*;

/**
 *
 * 문제 설명
 * 스파이들은 매일 다른 옷을 조합하여 입어 자신을 위장합니다.
 *
 * 예를 들어 스파이가 가진 옷이 아래와 같고 오늘 스파이가 동그란 안경, 긴 코트, 파란색 티셔츠를 입었다면 다음날은 청바지를 추가로 입거나 동그란 안경 대신 검정 선글라스를 착용하거나 해야 합니다.
 *
 * 종류	이름
 * 얼굴	동그란 안경, 검정 선글라스
 * 상의	파란색 티셔츠
 * 하의	청바지
 * 겉옷	긴 코트
 * 스파이가 가진 의상들이 담긴 2차원 배열 clothes가 주어질 때 서로 다른 옷의 조합의 수를 return 하도록 solution 함수를 작성해주세요.
 *
 * 제한사항
 * clothes의 각 행은 [의상의 이름, 의상의 종류]로 이루어져 있습니다.
 * 스파이가 가진 의상의 수는 1개 이상 30개 이하입니다.
 * 같은 이름을 가진 의상은 존재하지 않습니다.
 * clothes의 모든 원소는 문자열로 이루어져 있습니다.
 * 모든 문자열의 길이는 1 이상 20 이하인 자연수이고 알파벳 소문자 또는 '_' 로만 이루어져 있습니다.
 * 스파이는 하루에 최소 한 개의 의상은 입습니다.
 * 입출력 예
 * clothes	return
 * [["yellowhat", "headgear"], ["bluesunglasses", "eyewear"], ["green_turban", "headgear"]]	5
 * [["crowmask", "face"], ["bluesunglasses", "face"], ["smoky_makeup", "face"]]	3
 * 입출력 예 설명
 * 예제 #1
 * headgear에 해당하는 의상이 yellow_hat, green_turban이고 eyewear에 해당하는 의상이 blue_sunglasses이므로 아래와 같이 5개의 조합이 가능합니다.
 *
 * 1. yellow_hat
 * 2. blue_sunglasses
 * 3. green_turban
 * 4. yellow_hat + blue_sunglasses
 * 5. green_turban + blue_sunglasses
 * 예제 #2
 * face에 해당하는 의상이 crow_mask, blue_sunglasses, smoky_makeup이므로 아래와 같이 3개의 조합이 가능합니다.
 *
 * 1. crow_mask
 * 2. blue_sunglasses
 * 3. smoky_makeup
 */
public class DisguiseOfSpy {

    public static void main(String[] args) {

        // 여기서는 전신 중 한 곳만 입는 것도 가능하다.
        // category가 있으면 개수대로 더하고, 조합의 수도 더해주면 될듯

        String[][] arr = {{"계란후라이","아침"},{"김치찌개","점심"}, {"샐러드","저녁"}, {"코피","아침"},{"우유한잔","아침"}};
        String[][] arr2 = {{"A", "1"},{"A","2"},{"B","a"},{"C","f"}};

        String[][] test = {{"yellowhat","head"},{"bluesunglasses","eyewear"},{"redhat","head"}};
        // 1 3 A1 A2 Ba Cf // 4 , A1 Ba Cf / A1 Cf / A1 Ba // 6 , Ba Cf
        // 1 1
        // 1 1
        int result = solution(arr);
        int result2 = solution(test);
        System.out.println(result);
    }


    public static int solution(String[][] clothes) {

        int elementNum = 0;
        int combination = 1;

//        String[] testArr = new String[]{arr[0][1]};

        HashMap<String, Set<String>> map = new HashMap<>();

        for(String[] innerArr: clothes){
            Set<String> menuSet = new HashSet<>();

            if(map.get(innerArr[1]) == null){
                menuSet.add(innerArr[0]);
                map.put(innerArr[1], menuSet);
            }

            map.computeIfPresent(innerArr[1], (k,v) -> {
                v.add(innerArr[0]);
                return v;
            });

        }


        for(Map.Entry<String, Set<String>> entry : map.entrySet()){
            int size = entry.getValue().size();
            combination *= (size+1);
        };

        return combination-1;
    }


    // 다른 사람의 풀이
    public int solution2(String[][] clothes) {
        return Arrays.stream(clothes)
                .collect(groupingBy(p -> p[1], mapping(p -> p[0], counting())))
                .values()
                .stream()
                .collect(reducing(1L, (x, y) -> x * (y + 1))).intValue() - 1;
    }
}
