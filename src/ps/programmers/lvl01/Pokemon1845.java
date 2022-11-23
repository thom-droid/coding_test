package ps.programmers.lvl01;

import java.util.HashMap;

public class Pokemon1845 {

    public int solution(int[] nums) {

        int picks = nums.length / 2;
        HashMap<Integer, Integer> pokemonMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            pokemonMap.put(nums[i], pokemonMap.getOrDefault(nums[i], 0) + 1);
        }

        int selection = pokemonMap.keySet().size();

        return Math.min(selection, picks);
    }

}
