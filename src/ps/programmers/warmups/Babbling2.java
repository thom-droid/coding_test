package ps.programmers.warmups;

public class Babbling2 {

    public int solution(String[] babbling) {

        String[] str = {"aya", "ye", "woo", "ma"};
        int answer = 0;


        for (int i = 0; i < babbling.length; i++) {
            for (int j = 0; j < str.length; j++) {
                int index = babbling[i].indexOf(str[j]);

                while (babbling[i].contains(str[j])) {

                    if (babbling[i].contains(str[j].concat(str[j]))) {
                        break;
                    }

                    babbling[i] = babbling[i].replaceFirst(str[j], " ");
                }

            }

            babbling[i] = babbling[i].replaceAll(" ", "");

            if (babbling[i].isEmpty()) {
                answer++;
            }
        }

        return answer;

    }

}
