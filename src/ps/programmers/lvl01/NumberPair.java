package ps.programmers.lvl01;

public class NumberPair {

    public String solution(String X, String Y) {
        int[] xCount = new int[10];
        int[] yCount = new int[10];

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < X.length(); i++) {
            xCount[X.charAt(i) - 48]++;
        }

        for (int i = 0; i < Y.length(); i++) {
            yCount[Y.charAt(i) - 48]++;
        }

        for (int i = xCount.length - 1; i >= 0; i--) {
            if (xCount[i] != 0 && yCount[i] != 0) {
                int minCount = Math.min(xCount[i], yCount[i]);
                sb.append(String.valueOf(i).repeat(minCount));
            }
        }

        if (sb.length() == 0) {
            return "-1";
        }

        if (sb.indexOf("0") == 0) {
            return "0";
        }

        return sb.toString();
    }
}
