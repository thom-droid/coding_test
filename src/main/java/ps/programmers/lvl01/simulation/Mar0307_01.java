package ps.programmers.lvl01.simulation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Mar0307_01 {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        HashMap<String, Integer> map = new HashMap<>(
                Map.of("code", 0,
                        "date", 1,
                        "maximum", 2,
                        "remain", 3)
        );
        int valIdx = map.get(ext);
        int sortIdx = map.get(sort_by);
        return Arrays.stream(data)
                .filter(d -> d[valIdx] < val_ext)
                .sorted(Comparator.comparingInt(d -> d[sortIdx]))
                .toArray(int[][]::new);
    }
}
