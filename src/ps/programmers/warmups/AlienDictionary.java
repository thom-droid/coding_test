package ps.programmers.warmups;

public class AlienDictionary {

    public int solution(String[] spell, String[] dic) {
        boolean[] isContained = new boolean[spell.length];

        for (int i = 0; i < dic.length; i++) {
            if (dic[i].length() == spell.length) {
                for (String s : spell) {
                    dic[i] = dic[i].replaceFirst(s, "");
                }
                if (dic[i].isEmpty()) {
                    return 1;
                }
            }
        }

        return 2;
    }
}
