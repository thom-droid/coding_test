package ps.programmers.lvl02;

import java.util.ArrayList;
import java.util.Comparator;

public class SortFile17686 {

    public String[] solution(String[] files) {

        ArrayList<FileName> list = new ArrayList<>();

        for (String s : files) {

            int headIndex = 0;
            int numberIndex = s.length();

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                if (Character.toString(c).matches("\\d")) {
                    headIndex = i;
                    break;
                }
            }

            for (int i = headIndex; i < s.length() ; i++) {
                char c = s.charAt(i);
                if (!Character.toString(c).matches("\\d")) {
                    numberIndex = i;
                    break;
                }
            }

            String head = s.substring(0, headIndex);
            String number = s.substring(headIndex, numberIndex);
//            String tail = s.substring(numberIndex);

            FileName fileName = FileName.of(s, head, number);
            list.add(fileName);

        }

        Comparator<FileName> comparator = (o1, o2) -> {

            if (o1.head.compareToIgnoreCase(o2.head) == 0) {
                Integer number1 = Integer.parseInt(o1.number);
                Integer number2 = Integer.parseInt(o2.number);
                return number1.compareTo(number2);
            }

            return o1.head.compareToIgnoreCase(o2.head);
        };

        list.sort(comparator);
        String[] answer = new String[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i).originalName;
        }

        return answer;
    }

    private static class FileName{

        private final String originalName;
        private final String head;
        private final String number;


        public static FileName of(String originalName, String head, String number) {
            return new FileName(originalName, head, number);
        }

        private FileName(String originalName, String head, String number) {
            this.originalName = originalName;
            this.head = head;
            this.number = number;
        }
    }


}
