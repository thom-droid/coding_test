package ps.programmers.lvl02.simul;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Mar0315MinMax {
    public String solution(String s) {
        String[] arr = s.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (String value : arr) {
            int num = Integer.parseInt(value);
            if (num < min) min = num;
            if (num > max) max = num;
        }
        return min + " " + max;
    }
}
