package ps.programmers.warmups;

public class Flip2 {

    public static void main(String[] args) {
        System.out.println(flip("Strong"));
    }

    public static String flip(String my_string) {

        StringBuilder sb = new StringBuilder();

        for (int length = my_string.length(); length > 0; length--) {
            sb.append(my_string.charAt(length - 1));
        }

        return sb.toString();

    }
}
