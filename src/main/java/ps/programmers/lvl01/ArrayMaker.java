package ps.programmers.lvl01;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayMaker {

    public int[] solution(long n) {
        String str = String.valueOf(n);

        int[] result = new int[str.length()];

        for (int i = str.length() - 1; i >= 0; i--) {
            result[str.length() - i - 1] = str.charAt(i) - 48;
        }

        return result;
    }

}
