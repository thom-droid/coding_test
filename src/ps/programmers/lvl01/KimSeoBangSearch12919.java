package ps.programmers.lvl01;

public class KimSeoBangSearch12919 {
    public String solution(String[] seoul) {

        String answer = "";

        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                return "김서방은 " + i + "에 있다";
            }
        }
        return answer;
    }

}
