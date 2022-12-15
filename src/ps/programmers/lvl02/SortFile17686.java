package ps.programmers.lvl02;

public class SortFile17686 {

    public String[] solution(String[] files) {

        String[] answer = {};

        for (String s : files) {

            int firstIndex = 0;

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                if (Character.toString(c).matches("\\d")) {
                    firstIndex = i;
                    break;
                }
            }



            String head = s.substring(0, firstIndex + 1);
            String number =
        }

        return answer;
    }

}
