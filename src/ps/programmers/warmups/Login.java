package ps.programmers.warmups;

import java.util.HashMap;

public class Login {

    public String solution(String[] id_pw, String[][] db) {

        HashMap<String, String> dbMap = new HashMap<>();

        for (String[] userInfo : db) {
            dbMap.put(userInfo[0], userInfo[1]);
        }

        String id = id_pw[0];
        String pw = id_pw[1];

        if (dbMap.containsKey(id)) {
            if (dbMap.get(id).equals(pw)) {
                return "login";
            } else {
                return "wrong pw";
            }
        }

        return "fail";
    }

}
