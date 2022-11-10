package ps.programmers.warmups;

public class Dungeon {

    public int[] solution(String[] keyinput, int[] board) {
        int[] coordinates = new int[2];
        int w = board[0] / 2;
        int h = board[1] / 2;

        for (int i = 0; i < keyinput.length; i++) {
            if (keyinput[i].startsWith("u") && coordinates[1] < h ) {
                coordinates[1]++;
            }

            if (keyinput[i].startsWith("d") && coordinates[1] > -h) {
                coordinates[1]--;
            }

            if (keyinput[i].startsWith("r") && coordinates[0] < w) {
                coordinates[0]++;
            }

            if (keyinput[i].startsWith("l") && coordinates[0] > -w) {
                coordinates[0]--;
            }
        }

        return coordinates;
    }

}
