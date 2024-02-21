package ps.programmers.lvl01;

public class PhoneNumber {

    public String solution(String phone_number) {
        int size = phone_number.length();
        String asterik = "*".repeat(size - 4);
        String lastDigits = phone_number.substring(size - 4);
        return String.join("", asterik, lastDigits);

    }
}
