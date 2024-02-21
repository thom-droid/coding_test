package ps.programmers.warmups;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class OverlappedLines {

    public int solution(int[][] lines) {

        Arrays.sort(lines, Comparator.comparingInt(o -> o[0]));
        int[] section1 = measureOverlappedSection(lines[0], lines[1]);
        int[] section2 = measureOverlappedSection(lines[1], lines[2]);
        int[] section3 = measureOverlappedSection(lines[0], lines[2]);

        int[] overlapped1 = measureOverlappedSection(section1, section2);
        int[] overlapped2 = measureOverlappedSection(section2, section3);
        int[] overlapped3 = measureOverlappedSection(section1, section3);

        int overlappedLength;

        if (overlapped1[0] == overlapped2[0] && overlapped1[0] == overlapped3[0] && overlapped1[1] == overlapped2[1] && overlapped1[1] == overlapped3[1]) {
            overlappedLength = calculateLen(overlapped1) * 2;
        } else {
            overlappedLength = calculateLen(overlapped1) + calculateLen(overlapped2) + calculateLen(overlapped3);
        }

        int whole = calculateLen(section1) + calculateLen(section2) + calculateLen(section3);

        return whole - overlappedLength;
    }

    private int[] measureOverlappedSection(int[] a, int[] b) {
        int[] arr = new int[2];

        if (b[0] >= a[1]) {
            return arr;
        }

        if (b[1] <= a[1]) {
            return b;
        }

        arr[0] = b[0];
        arr[1] = a[1];

        return arr;
    }

    private int calculateLen(int[] a) {
        return a[1] - a[0];
    }


    public int solution2(int[][] lines) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < lines.length; i++) {

            for (int j = lines[i][0]; j < lines[i][1]; j++) {
                map.put(j, map.getOrDefault(j, 0) + 1);
            }
        }

        int answer = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 2) {
                answer++;
            }
        }

        return answer;
    }
}
