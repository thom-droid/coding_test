package ps.programmers.lvl02;

import java.util.HashSet;
import java.util.Objects;

public class Visited49994B {

    private final int[] pointer = new int[]{0, 0};
    private final HashSet<Move> set = new HashSet<>();

    public int solution(String dirs) {

        for (int i = 0; i < dirs.length(); i++) {
            char instruction = dirs.charAt(i);
            doInstruction(instruction);
        }

        return set.size();

    }

    private void doInstruction(char instruction) {

        int x = pointer[1];
        int y = pointer[0];

        int[] currentPointer = point(instruction);

        int x2 = currentPointer[1];
        int y2 = currentPointer[0];

        if (x2 <= 5 && x2 >= -5 && y2 <= 5 && y2 >= -5) {

            Move move = Move.of(instruction, x, y, x2, y2);
            set.add(move);
            pointer[1] = x2;
            pointer[0] = y2;

        }
    }

    private int[] point(char instruction) {

        if (instruction == 'U') {
            return new int[]{pointer[0] + 1, pointer[1]};
        }

        if (instruction == 'D') {
            return new int[]{pointer[0] - 1, pointer[1]};
        }

        if (instruction == 'L') {
            return new int[]{pointer[0], pointer[1] - 1};
        }

        if (instruction == 'R') {
            return new int[]{pointer[0], pointer[1] + 1};
        }

        throw new IllegalArgumentException("invalid instruction");
    }

    private static class Move {

        int x;
        int y;
        int x2;
        int y2;

        public static Move of(char instruction, int x, int y, int x2, int y2) {

            if (instruction == 'U' || instruction == 'R') {
                return new Move(x, y, x2, y2);
            }

            return new Move(x2, y2, x, y);
        }

        public Move(int x, int y, int x2, int y2) {
            this.x = x;
            this.y = y;
            this.x2 = x2;
            this.y2 = y2;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Move move = (Move) o;
            return x == move.x && y == move.y && x2 == move.x2 && y2 == move.y2;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y, x2, y2);
        }
    }

}
