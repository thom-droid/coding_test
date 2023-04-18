package ps.programmers.warmups;

public class AlphabetCreator {

    public String solution(String s, String skip, int index) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            int idx = 0;

            while (idx < index) {
                c++;

                if (c > 'z') {
                    c = 'a';
                }

                if (!skip.contains(String.valueOf(c))) {
                    idx++;
                }
            }

            sb.append(c);

        }
//        for (int i = 0; i < s.length(); i++) {

//            int tmp = index;
//            char c = s.charAt(i);
//
//            for (int j = 1; j <= tmp; j++) {
//                if (containedInArray((char) (c + j), chars)) {
//                    tmp++;
//                }
//            }
//
//            c = backToBeginning((char) (c + tmp));
//            sb.append(c);

//        }

        return sb.toString();
    }

    private char backToBeginning(char c) {
        while (c > 'z') {
            c = (char) (96 + (c % 'z'));
        }

        return c;
    }

    private boolean containedInArray(char c, char[] chars) {
        char n = backToBeginning(c);
        for (char aChar : chars) {
            if (n == aChar) {
                return true;
            }
        }
        return false;
    }
}
