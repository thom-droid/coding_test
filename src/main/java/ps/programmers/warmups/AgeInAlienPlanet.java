package ps.programmers.warmups;

public class AgeInAlienPlanet {

    public static void main(String[] args) {
        System.out.println(solution(23));

    }

    private static String solution(int age) {
        String str = String.valueOf(age);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) + 49;
            char c = (char) val;
            sb.append(c);
        }

        return sb.toString();
    }
}
