package ps.programmers.lvl01.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Feb0221 {

    public int[] solution(String[] park, String[] routes) {

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('N', 0);
        map.put('S', 1);
        map.put('W', 2);
        map.put('E', 3);
        int x = 0;
        int y = 0;

        int width = park.length;
        int height = park[0].length();
        int[][] p = new int[width][height];

        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[0].length(); j++) {
                char c = park[i].charAt(j);
                if (c == 'S') {
                    x = i;
                    y = j;
                    p[i][j] = 1;
                } else if (c == 'X') {
                    p[i][j] = -1;
                } else {
                    p[i][j] = 0;
                }
            }
        }

        for (String route : routes) {
            int nextX = x;
            int nextY = y;

            char op = route.charAt(0);
            int move = route.charAt(2) - '0';
            boolean valid = true;

            for (int i = 0; i < move; i++) {
                nextX += dx[map.get(op)];
                nextY += dy[map.get(op)];

                if (nextY < 0 || nextX < 0 || nextX >= width || nextY >= height || p[nextX][nextY] == -1) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                x = nextX;
                y = nextY;
            }
        }
        return new int[]{x, y};
    }
}
