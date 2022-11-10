package ps.programmers.warmups;

import java.util.ArrayList;

public class Factorization {

    public int[] solution(int n) {
        boolean[] isChecked = new boolean[n + 1];
        isChecked[0] = isChecked[1] = true;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (!isChecked[i] && n % i == 0) {
                for (int j = i * 2; j < isChecked.length; j += i) {
                    isChecked[j] = true;
                }
                list.add(i);
            }
        }

        return list.stream().mapToInt(value -> value).toArray();
    }
}
