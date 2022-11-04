package ps.programmers.warmups;

public class PrintString {

    public static void main(String[] args) {

        System.out.println(solution("hello", 2));

    }

    private static String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < n; j++) {
                sb.append(my_string.charAt(i));
            }
        }

        return sb.toString();
    }
}
