package ps.programmers.lvl01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DivisorArray12910 {

    public Integer[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i : arr) {
            if (i % divisor == 0) {
                list.add(i);
            }
        }

        Collections.sort(list);

        if (list.size() == 0) {
            list.add(-1);
        }

        return list.toArray(Integer[]::new);
    }


}
