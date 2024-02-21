package ps.programmers.lvl02;

import java.util.HashMap;

public class Visited49994 {

    private final int[] pointer = new int[]{0, 0};
    private final HashMap<String, Integer> map = new HashMap<>();

    public int solution(String dirs) {

        for (int i = 0; i < dirs.length(); i++) {
            char instruction = dirs.charAt(i);
            movePointer(instruction);
        }

        map.remove("duplicated");

        return map.size();
    }

    private void movePointer(char instruction) {

        int x = pointer[1];
        int y = pointer[0];
        String record;
        boolean instructed = false;

        if (instruction == 'U' || instruction == 'D') {
            instructed = instructedY(y, instruction);
        }

        if (instruction == 'R' || instruction == 'L') {
            instructed = instructedX(x, instruction);
        }

        if (instructed) {
            record = buildString(x, y);
            map.put(record, 1);
        }

    }

    private boolean instructedX(int x, char instruction) {

        if (x + 5 <= 0 || x - 5 >= 10){
            map.put("duplicated", 1);
            return false;
        }

        if (instruction == 'L') {
            pointer[1]--;
        }

        if (instruction == 'R') {
            pointer[1]++;
        }

        return true;
    }

    private boolean instructedY(int y, char instruction) {

        if (y + 5 <= 0 || y - 5 >= 10) {
            map.put("duplicated", 1);
            return false;
        }

        if (instruction == 'U') {
            pointer[0]++;
        }

        if (instruction == 'D') {
            pointer[0]--;
        }

        return true;
    }

    private String buildString(int x, int y) {

        return "x : " + x + "to" + pointer[1] +
                "y : " + y + "to" + pointer[0];
    }

}
