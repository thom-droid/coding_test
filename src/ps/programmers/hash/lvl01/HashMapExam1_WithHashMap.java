package ps.programmers.hash.lvl01;

import java.util.HashMap;

/*
 * 다른 사람이 hashmap으로 만든 답안
 */
public class HashMapExam1_WithHashMap {

	// 각 번지 수에 1을 부여해준다. 중복이 있으면, getOrDefault()로 추가 1점이 부여되어 중복된 player는 2점이 된다.
	// completion 에서 player 이름으로 1씩 뺀다. 그러면 동명이인이거나 completion에 없는 사람은 1점이 된다. 
	// 값을 부여해서 소거하는 접근은 맞았지만, 구체적으로 푸는 방법은 생각도 못했다. 
	public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        for (String player : completion) hm.put(player, hm.get(player) - 1);

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                answer = key;
            }
        }
        return answer;
    }
}
