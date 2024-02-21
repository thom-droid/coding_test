package ps.programmers.lvl01;

public class MiddleString12903 {

    public String solution(String s) {

        int size = s.length();

        String value = String.valueOf(s.charAt(size / 2));
        if (size % 2 == 1) {
            return value;
        } else {
            return s.charAt(size / 2 - 1) + value;
        }

    }

}
