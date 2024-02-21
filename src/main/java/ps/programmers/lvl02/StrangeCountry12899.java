package ps.programmers.lvl02;

import java.util.ArrayList;

public class StrangeCountry12899 {

    public String solution(int n) {

        StringBuilder sb = new StringBuilder();

        while (n > 3) {

            int tmp = n % 3;

            if (tmp == 0) {
                n = (n / 3) - 1;
                sb.append(4);
            } else {
                sb.append(tmp);
                n /= 3;
            }

        }

        if (n == 3) {
            sb.append(4);
        } else {
            sb.append(n);
        }

        return sb.reverse().toString();
    }

    private String recursive(int n, StringBuilder sb) {

        if (n == 3) {
            sb.append(4);
        } else if (n <= 2) {
            sb.append(n);
        } else {
            int tmp = n % 3;

            if (tmp == 0) {
                n = (n / 3) - 1;
                sb.append(4);
            } else {
                sb.append(tmp);
                n /= 3;
            }
        }

        return sb.toString();
    }

    static void permute(String s, String answer)
    {
        if (s.length() == 0) {
            System.out.print(answer + "  ");
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String left_substr = s.substring(0, i);
            String right_substr = s.substring(i + 1);
            String rest = left_substr + right_substr;
            permute(rest, answer + ch);
        }
    }


}
