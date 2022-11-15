package ps.programmers.warmups;

import java.util.StringTokenizer;

public class Polynomial {

    public String solution(String polynomial) {

        StringTokenizer st = new StringTokenizer(polynomial, " ");
        StringBuilder sb = new StringBuilder();

        int xCount = 0;
        int constantCount = 0;

        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            String value;

            if (token.equals("+")) {
                continue;
            }

            if (token.endsWith("x")) {
                value = token.substring(0, token.lastIndexOf("x"));
                if (value.equals("")) {
                    xCount++;
                } else {
                    xCount += Integer.parseInt(value);
                }
            } else {
                constantCount += Integer.parseInt(token);
            }

        }

        if (xCount == 0) {
            if (constantCount != 0) {
                return sb.append(constantCount).toString();
            }
            return "0";
        }

        if (xCount == 1) {
            sb.append("x");
        } else {
            sb.append(xCount).append("x");
        }

        if (constantCount != 0) {
            sb.append(" + ").append(constantCount);
        }

        return sb.toString();

    }
}
