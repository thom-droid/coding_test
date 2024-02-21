package ps.programmers.warmups;

public class Cipher {

    public static void main(String[] args) {

    }

    public String solution(String cipher, int code) {
        StringBuilder sb = new StringBuilder();
        int n = code;
        while (n <= cipher.length()) {
            sb.append(cipher.charAt(n - 1));
            n += code;
        }

        return sb.toString();
    }
}
