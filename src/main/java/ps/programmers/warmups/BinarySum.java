package ps.programmers.warmups;

import java.util.Arrays;

public class BinarySum {

    public String solution(String bin1, String bin2) {
        StringBuilder sb = new StringBuilder();
        long dec1 = Long.parseLong(bin1);
        long dec2 = Long.parseLong(bin2);
        long sum = dec1 + dec2;
        int len = Math.max(bin1.length(), bin2.length());
        int[] array = new int[len + 1];

        long m = 10;

        for (int i = array.length - 1; i >= 0; i--) {

            array[i] = (int) (sum % m / (m / 10));
            m *= 10;

        }

        for (int i = array.length - 1; i >= 0; i--) {

            if (array[i] >= 2) {
                array[i] -= 2;
                array[i - 1]++;
            }
        }

        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
        }

        if (sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        return sb.toString();
    }

    public int[] mapToIntArray(String str) {
        int[] result = new int[str.length()];

        for (int i = 0; i < result.length; i++) {
            result[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }

        return result;
    }
}
