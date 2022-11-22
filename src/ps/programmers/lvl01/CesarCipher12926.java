package ps.programmers.lvl01;

public class CesarCipher12926 {

    public String solution(String s, int n) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if ( c == ' ') {
                sb.append(" ");
                continue;
            }

            if (c >= 65 && c <= 90) {
                c = c + n > 90 ? (char) ((n + c) - 26) : (char) (c + n);
            }

            if (c >= 97 && c <= 122) {
                c = c + n > 122 ? (char) ((n + c) - 26) : (char) (n + c);
            }

            sb.append(c);
        }

        return sb.toString();
    }


}
