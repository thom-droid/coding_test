package ps.programmers.warmups;

public class Murmur {

    public int solution(String[] babbling) {

        String[] str = {"aya", "ye", "woo", "ma"};
        int answer = 0;

        for (int i = 0; i < babbling.length; i++) {
            for (int j = 0; j < str.length; j++) {
                babbling[i] = babbling[i].replaceAll(str[j], " ");
            }
            babbling[i] = babbling[i].replaceAll(" ", "");
            if (babbling[i].isEmpty()) {
                answer++;
            }
        }

        return answer;
    }
}
