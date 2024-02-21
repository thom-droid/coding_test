package ps.programmers.lvl02;

import java.util.Arrays;

public class MaxAndMin {

    public String solution(String s) {
        int[] arr = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).sorted().toArray();

        return arr[0] + " " + arr[arr.length - 1];
    }

}
