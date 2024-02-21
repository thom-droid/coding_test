package ps.leet;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {


    public static void main(String[] args) {
//        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
//        System.out.println(Arrays.toString(twoSum(new int[]{3,2,4}, 6)));
//        System.out.println(Arrays.toString(twoSum(new int[]{3,3,3,3,3}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{-1,-2,-3,-4,-5}, -8)));

    }

    // [2,7,11,15] , target = 9
    private static int[] twoSum(int[] numbers, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];

        for (int i = 0; i < numbers.length; i++) {

            map.put(numbers[i], i); // (0, 2), (1, 7), ...

            // (2,0), (7,1)...
            // (3,0), (3,1)...
        }

        for (int i = 0; i < numbers.length; i++) {

            int pair = target - numbers[i]; // 7

            // if the pair value is the same with itself...something needs to be done

            if (map.containsKey(pair) && map.get(pair) != i) { // if key with 7 exists... then retrieve that index, but it must not be itself
                return new int[]{i, map.get(pair)};
            }
        }

        return result;
    }
}
