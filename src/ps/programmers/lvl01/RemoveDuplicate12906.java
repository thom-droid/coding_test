package ps.programmers.lvl01;

import java.util.ArrayList;

public class RemoveDuplicate12906 {

    public Integer[] solution(int [] arr) {

        int cur = -1;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (cur == arr[i]) {
                continue;
            }

            cur = arr[i];
            list.add(arr[i]);
        }

        return list.toArray(Integer[]::new);

    }
}
