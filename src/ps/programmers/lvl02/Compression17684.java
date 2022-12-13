package ps.programmers.lvl02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Compression17684 {

    public Integer[] solution(String msg) {

        HashMap<String, Integer> indices = new HashMap<>();
        ArrayList<Integer> printer = new ArrayList<>();

        for (int i = 1; i <= 26; i++) {
            char c = 64;
            indices.put(Character.toString(c + i), i);
        }


        while (!msg.isEmpty()) {

            String tmp = msg;

            if (msg.length() == 1) {
                int index = indices.get(msg);
                printer.add(index);
                break;
            }

            // 현재 문자열에 대한 색인이 없다면
            while (!tmp.isEmpty()) {

                if (indices.containsKey(tmp)) {
                    break;
                }

                tmp = tmp.substring(0, tmp.length() - 1);
            }

            int index = indices.get(tmp);
            printer.add(index);

            // 처리되지 않은 문자열이 있다면 w+c 하여 진행
            if (tmp.length() != msg.length()) {

                char c = msg.charAt(msg.indexOf(tmp) + tmp.length());
                String next = Character.toString(c);
                String newIndex = tmp + next;
                indices.put(newIndex, indices.size() + 1);
                msg = msg.substring(tmp.length());

            } else {
                break;
            }
        }

        return printer.toArray(Integer[]::new);
    }

    public int[] solution2(String msg) {

        ArrayList<String> indices = new ArrayList<>(List.of("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"));
        ArrayList<Integer> printer = new ArrayList<>();

        for (int i = indices.size() - 1; i >= 0; i--) {



        }




        return null;

    }


}
