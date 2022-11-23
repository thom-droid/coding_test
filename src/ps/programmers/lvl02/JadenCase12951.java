package ps.programmers.lvl02;

public class JadenCase12951 {

    public String solution(String s) {

        if (s.isBlank()) {
            return "";
        }

        String[] str = s.toLowerCase().split(" ", -1);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length; i++) {

            if (str[i].isBlank()) {
                sb.append(" ");
                continue;
            }

            String first = Character.toString(str[i].charAt(0)).toUpperCase();
            String rest = str[i].substring(1);

            sb.append(first).append(rest).append(" ");
        }

        sb.deleteCharAt(sb.length() - 1);

        return sb.toString();
    }

}
