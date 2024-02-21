package ps.programmers.lvl02;

import java.util.ArrayList;
import java.util.HashMap;

public class OpenChatRoom42888 {

    public String[] solution(String[] record) {

        // 입력값을 배열로 나눔

        // 원소의 0번지는 명령어, 1번지는 uid, 2번지는 닉네임

        // 명령어에 따라 분기를 나눈다. 결과만을 출력하면 되므로, 배열을 순회하면서 명령어에 따라 해시맵에 값을 넣거나 변경한 뒤, 마지막에 출력하면 됨

        HashMap<String, String> user = new HashMap<>();
        String[] commands = new String[record.length];
        String[] users = new String[record.length];
        ArrayList<String> list = new ArrayList<>();
        String[] suffix = new String[]{"님이 들어왔습니다.", "님이 나갔습니다."};

        for (int i = 0; i < record.length; i++) {
            String[] log = record[i].split(" ");
            if (log.length == 3) {
                user.put(log[1], log[2]);
            }
            commands[i] = log[0];
            users[i] = log[1];
        }


        for (int i = 0; i < commands.length; i++) {
            StringBuilder sb = new StringBuilder();

            if (commands[i].equals("Change")) {
                continue;
            }

            String uid = users[i];
            String nickname = user.get(uid);

            if (commands[i].equals("Enter")) {
                sb.append(nickname).append(suffix[0]);
            }

            if (commands[i].equals("Leave")) {
                sb.append(nickname).append(suffix[1]);
            }
            list.add(sb.toString());
        }

        return list.toArray(String[]::new);

    }
}
