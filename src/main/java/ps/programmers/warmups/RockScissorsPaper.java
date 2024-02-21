package ps.programmers.warmups;

public class RockScissorsPaper {

    public static void main(String[] args) {
        System.out.println(solution("205"));
    }

    private static String solution(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            sb.append(findWinningElement(str.charAt(i)));
        }

        return sb.toString();
    }

    private static String findWinningElement(char c) {
        return c == '2' ? "0" : c == '0' ? "5" : "2";
    }

}
