package ps.programmers.warmups;


public class Vowel {

    public static void main(String[] args) {
        System.out.println(solution("abus"));
    }

    private static String solution(String my_string) {
        String regex = "[a|e|i|o|u]";
        my_string = my_string.replaceAll(regex, "");

        return my_string;
    }

}
